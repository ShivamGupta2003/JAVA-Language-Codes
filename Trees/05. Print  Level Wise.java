/*

Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space).
Print different levels in differnet lines.

Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 

Output Format :
Level wise print

Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 

Sample Output :
10
20 30 40 
40 5
  
*/
  
 // Node Class

class Node<T> 
{
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
	
}


// Queue Class

class Queue<T>
{
private Node<T> front;
private Node<T> rear;
private int size;

public Queue() {
	front = null;
	rear = null;
	size = 0;
}

int size(){
	return size;
}

boolean isEmpty(){
	return size == 0;
}

T front() {
	return front.data;
}

void enqueue(T element){
	Node<T> newNode = new Node<>(element);
	if(rear == null){
		front = newNode;
		rear = newNode;
	}else{
		rear.next = newNode;
		rear = newNode;
	}
	size++;

}

T dequeue() {
	T temp = front.data;
	front = front.next;
	if(size == 1){
		rear = null;
	}
	size--;
	
	return temp;
}
}


// Solution Class that contains functions for solving problem

public class Solution {
	public static void printLevelWise(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> q= new Queue<>();
        q.enqueue(root);
        System.out.println(root.data);
        int check=0;
        int flag=0;

        while(!q.isEmpty())
        {
           TreeNode<Integer> frontNode=q.dequeue();
           
           if(check==frontNode.data && flag==1)
             {
             System.out.println();
             flag=0;
             }          
           for(int i=0;i<frontNode.children.size();i++)
            {
            TreeNode<Integer> k=frontNode.children.get(i);
            q.enqueue(k);
            System.out.print(k.data+" ");
            }
            
            if(frontNode.children.size()!=0 && flag==0)
            {
            check=frontNode.children.get(0).data;
            flag=1;
            }
          

        }
        
	}
}



// Main Class Code
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
		Solution.printLevelWise(root); 
	}

}

  

