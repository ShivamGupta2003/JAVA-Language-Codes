// QUESTION:-    UNDERSTANDING HOW TO TAKE INSERT A NODE IN LINKED LIST BY INSERT NODE FUNCTION AT ANY POSN THAT IS GIVEN BY USER


import java.util.Scanner;

class Node<T> {	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		next = null;
	}
}


public class LinkedListUse {
	
  
  //Take Input function that helps to take input of Linked List
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
	
  
  // Print Function that Helpas to print the updated Linked List
	public static void print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

  // Insert function that we wished to create for imserting a node in between a linked list at position pos where head of Linked List is termed ad pos=0
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0){
			newNode.next = head;
			return newNode;
		}
		int i = 0;
		Node<Integer> temp = head;
		while(i < pos - 1){
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
	
  
  //Main Code
	public static void main(String[] args) {
		int pos = s.nextInt();
		Node<Integer> head = takeInput();
		head = insert(head, 80, pos
		print(head);
		

	}

}
