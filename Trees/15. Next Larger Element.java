/*
Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
Return NULL if no node is present with value greater than n.

Input format :
Line 1 : Integer n
Line 2 : Elements in level order form separated by space (as per done in class). Order is -
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
Output format : Node with value just greater than n.

Sample Input 1 :
18
10 3 20 30 40 2 40 50 0 0 0 0 

Sample Output 1 :
20

Sample Input 2 :
21
10 3 20 30 40 2 40 50 0 0 0 0 

Sample Output 2:
30
*/





import java.util.LinkedList;
import java.util.Queue;


// SOLUTION CLASS THAT CONTAINS FUNCTION FOR SOLVING THE PROBLEM
public class Solution {

public static TreeNode<Integer> largest(TreeNode<Integer> rootNode ) {
		
    if(rootNode==null) 
    {
			return rootNode;
    }
		
    int max =rootNode.data;
		
    TreeNode<Integer> maxNode = rootNode;
		
    for(int i=0;i<rootNode.children.size();i++) {
			TreeNode<Integer> large = largest(rootNode.children.get(i));
			if(large == null){
				continue;
			}
			if(max <large.data) {
				max = large.data;
				maxNode = large;
			}
		}
		return maxNode;
	}
	
public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
    if(root==null)
        return null;
    
       TreeNode<Integer> largest=largest(root);
    
    if(root.data>n && largest.data>root.data)
      largest=root;
    
        if(largest.data>n)
        {
            for(int i = 0; i < root.children.size(); i++) 
            {

                TreeNode<Integer> l2=findNextLargerNode(root.children.get(i),n);    
               
                if(l2!=null && l2.data<largest.data && l2.data>n)
                   {
                       largest=l2;
                    }
                  
                
                }
            return largest;
            }
        

            return null;

        
        }    
}

        

// MAIN CLASS

import java.util.ArrayList;
import java.util.Scanner;

 class QueueEmptyException extends Exception {
}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}

   class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}

public class Main {



	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise(){
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
				int numChild = s.nextInt();
				for(int i = 0 ; i < numChild; i++){
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}


	public static void main(String[] args) {
   int n = s.nextInt();
    TreeNode<Integer> root =  takeInputLevelWise();

		TreeNode<Integer> ans = Solution.findNextLargerNode(root, n);
		if(ans == null){
			System.out.println(Integer.MIN_VALUE);
		}else{
			System.out.println(ans.data);
		}

	}

}
