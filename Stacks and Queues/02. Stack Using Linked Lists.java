//Question Create a Stack class and write code to create stack


// Node Class For Creating Linked Lists
class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
}



//Stack Empty Exception class that was used while constructing Stack
public class StackEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}



// Our Stack Class that we wished to create
public class StackUsingLL<T> {

	private Node<T> head;
	private int size;

	public StackUsingLL() {
		head = null;
		size = 0;	
	}

	int size(){
		return size;
	}
	boolean isEmpty(){
		return size() == 0; // head == null
	}

	T top() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException e = new StackEmptyException();
			//throw e;
			throw new StackEmptyException();
		}
		return head.data;
	}

	void push(T element){
		
		Node<T> newNode = new Node<T>(element);
		newNode.next = head;
		head = newNode;
		size++;
		
	}

	T pop() throws StackEmptyException{
		if(size() == 0){
			throw new StackEmptyException();
		}
		T tempdata = head.data;
		head = head.next;
		size--;
		return tempdata;
	
	}
}



//Main runner code that helps us to use and check functions of our stack class
public class StackUse {

	public static void main(String[] args) throws StackFullException {		
		StackUsingArray stack = new StackUsingArray(3);
		for(int i = 1; i <= 5; i++){
			stack.push(i);
		}
		
		while(!stack.isEmpty()){
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// Never reach here
			}
		}

	}

}
