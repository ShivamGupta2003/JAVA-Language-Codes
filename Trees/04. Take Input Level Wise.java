import java.util.ArrayList;
import java.util.Scanner;

// Tree Node Class

class TreeNode<T> {
	public T data;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
	
}


// Queue Using Linked List Class

class QueueUsingLL<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;

	public QueueUsingLL() {
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

	T front() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
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

	T dequeue() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
		
		T temp = front.data;
		front = front.next;
		if(size == 1){
			rear = null;
		}
		size--;
		
		return temp;
	}


}



// Queue Empty Exception

class QueueEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7243921724361015813L;

}


// Node Class
class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
	
}



public class TreeUse {	
	
  
  // Print Function
	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
  
  // Take Input Level Wise Function
	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + frontNode.data);
				int numChildren = s.nextInt();
				for (int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// Shouldn't come here
				return null;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {

		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
	}
}
