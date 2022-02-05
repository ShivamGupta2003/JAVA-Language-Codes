/*

Given a binary tree, print the zig zag order. In zigzag order, level 1 is printed from left to right, level 2 from right to left and so on. This means odd levels should get printed from left to right and even level right to left.

Input format:
The first line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have a left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.

Output Format:
The binary tree is printed level wise, as described in the task. Each level is printed in new line.

Constraints
Time Limit: 1 second

Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1

Sample Output :
5
10 6
2 3
9

*/





// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE PROBLEM
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class Solution {
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
    }
    
    
    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
     LinkedListNode<Integer> curr=head;
     LinkedListNode<Integer> prev=null;;
     LinkedListNode<Integer> temp;
        
        while(curr!=null)
        {
           temp=curr.next;
           curr.next=prev;
           prev=curr;
           curr=temp;
        }
        return prev;
        
	}
         
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		 
        if (root == null) 
        {
            return null;		
        }	
        
        
        ArrayList<LinkedListNode<Integer>> ans = new ArrayList<>();	
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();		
        pendingNodes.add(root);
        pendingNodes.add(null);
         		
        LinkedListNode<Integer> Head = null;		
        LinkedListNode<Integer> Tail = null;		
        		
        while (!pendingNodes.isEmpty()) {
           
            BinaryTreeNode<Integer> currentNode=pendingNodes.poll();				
 
             if (currentNode==null) {
               if(!pendingNodes.isEmpty())
	                pendingNodes.add(null);
                
                ans.add(Head);
                Head = null;
                Tail = null;
               
            }
            
            else{
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(currentNode.data);				
            
            if (Head == null) 
            {					
                Head = newNode;
                Tail = newNode;
            }
            
            else 
            {
                Tail.next = newNode;
                Tail = Tail.next;
            }
            
            
            if (currentNode.left != null) {
                pendingNodes.add(currentNode.left);
            }
            
            
            if (currentNode.right != null) {
                pendingNodes.add(currentNode.right);
            }	
            
            
            }
            
        }
        
        return ans;
    }
    
	public static void printZigZag(BinaryTreeNode<Integer> root){
      
        ArrayList<LinkedListNode<Integer>> getter=constructLinkedListForEachLevel(root);
        
        
        for(int i=0;i<getter.size();i++)
        {
            LinkedListNode<Integer> temp=getter.get(i);
        
        if(i%2==0)
            print(temp);
        
        else if(i%2==1)
        {
             LinkedListNode<Integer> xy=reverse_I(temp);
              print(xy);
        }
           
            System.out.println();
    }
    }
}


// main class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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


class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Runner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int start = 0;

		String[] nodeDatas = br.readLine().trim().split(" ");

		if (nodeDatas.length == 1) {
			return null;
		}
		
		int rootData = Integer.parseInt(nodeDatas[start]);
		start += 1;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}

			int leftChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}

			int rightChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}

		return root;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTreeNode<Integer> root = takeInput();

    Solution.printZigZag(root);
        

	}
}
