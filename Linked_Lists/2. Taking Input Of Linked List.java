// QUESTION:-    UNDERSTANDING HOW TO TAKE INPUT OF A LINKED LIST BY CALLING A TAKE INPUT FUNCTION

class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
}

import java.util.Scanner;
public class Main {
	
  
// The take input function that we wished to create. One constraint is that whenever -1 is entered by user The preveious entry will be tail of that Linked List i.e. for 
// creating a null Linked List we have to enter -1 only 
	
  public static Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{

				tail.next = newNode;
				tail = newNode; 
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

	
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	}

}
