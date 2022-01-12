//Question Create a Stack class and write code to create stack

//Stack Full Exception class that was used while constructing Stack
class StackFullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

//Stack Empty Exception class that was used while constructing Stack
public class StackEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}


// Our Stack Class that we wished to create
public class StackUsingArray {
	
	private int data[];
	private int top; // is the index of topmost element of stack
	
	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}
	
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public  boolean isEmpty(){
		return (top == -1);
	}
	
	public int size(){
		return top + 1;	
		}
	
	public int top() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) throws StackFullException{
		if(size() == data.length){
			// Stack Full
			StackFullException e = new StackFullException();
			throw e;			
		}
		top++;
		data[top] = elem;
	}

	public int pop() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
		
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
