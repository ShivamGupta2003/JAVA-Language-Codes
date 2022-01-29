/*

Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.

Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 

Output format:
Second Largest node data

Sample Input 1 :
10 3 20 30 40 2 40 50 0 0 0 0 

Sample Output 1 :
40

*/



// Solution Class that contains functions to solve problem

public class Solution {

  
    public static void replaceMax(TreeNode<Integer> root, int x){

		if(root.data==x)
            root.data=Integer.MIN_VALUE;
        
        
        TreeNode<Integer> ans=root;
        for(int i = 0; i < root.children.size(); i++) {
            replaceMax(root.children.get(i),x);
        } 
        
        
	} 
    

   public static TreeNode<Integer> largest(TreeNode<Integer> rootNode ) {
		if(rootNode==null) {
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
		
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        int m=largest(root).data;
       replaceMax(root,m);//replace
        
       
              return largest(root);
	}
	
	
}


// Main Class


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
		TreeNode<Integer> root =  takeInputLevelWise();
		TreeNode<Integer> ans = Solution.findSecondLargest(root);
		if(ans == null){
			System.out.println(Integer.MIN_VALUE);
		}else{
			System.out.println(ans.data);
		} 
	}

}


