/*
Given a large number represented in the form of a linked list. Write code to increment the number by 1 in-place(i.e. without using extra space).

Note: You don't need to print the elements, just update the elements and return the head of updated LL.

Input Constraints:
1 <= Length of Linked List <=10^6.

Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)

Output Format :
Line 1: Updated linked list elements 

Sample Input 1 :
3 9 2 5 -1

Sample Output 1 :
3 9 2 6

Sample Input 2 :
9 9 9 -1

Sample Output 1 :
1 0 0 0 
*/


// SOLUITION CLASS THAT CONTAINS FUNCTIONS FOR SOLVING QUESTION

public class Solution {

  
  // Reverse Function used while solving question
	public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
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

    
    
   // Function that we wished to create
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {

       
  { 
        head=reverse(head);
        
       LinkedListNode<Integer> temp=head;
        
        LinkedListNode<Integer> carry=new LinkedListNode<Integer>(1);
        
        while(temp!=null)
        {
        if(temp.data!=9)
        {
            temp.data+=1;
            break;
        }
        
         else if(temp.data==9 && temp.next==null)
        {
            temp.data=0;
            temp.next=carry;
            break;
        }
        
         else if(temp.data==9 && temp.next.data==9)
        {
            temp.data=0;
            temp=temp.next;
        }
        
        else 
        {
            temp.data=0;
            temp.next.data+=1;
            break;
        }
        
        
        }
        
        head=reverse(head);
        return head;
        
    }
}
}


// Main Code
import java.util.Scanner;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
public class Runner {
	static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
		
	public static void main(String[] args) {
		
		LinkedListNode<Integer> head = takeInput();
		head = Solution.nextLargeNumber(head);
		print(head);
		
	}

}
