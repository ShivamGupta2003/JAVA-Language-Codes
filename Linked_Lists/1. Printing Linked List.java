// QUESTION:-    UNDERSTANDING HOW TO PRINT A GIVEN LINKED LIST IN JAVA BY CALLING PRINT FUNCTION


class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
}


public class Main {
	
  //PRINT FUNCTION THAT WE WISHED TO MAKE
	public static void print(Node<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<Integer>(10);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(30);
		node1.next = node2;
		node2.next = node3;
		Node<Integer> head = node1;
		print(head);
	}

}

