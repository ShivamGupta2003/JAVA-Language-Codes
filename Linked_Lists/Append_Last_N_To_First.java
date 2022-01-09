//You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.

//functional code
/*

	Following is the Node class already written for the Linked List

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {

    public static int length(LinkedListNode<Integer> head){
		int i=0;
        while(head!=null){
            i++;
            head=head.next;}
        
      return i;

	}
    
    
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		int l=length(head);
        
        
        if(head==null || n==0  )
            return head;
        
        if(head.next==null || n>=l)
            return null;
        
        int i=0;
        
      
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> tail=head;
        LinkedListNode<Integer> prev=head;
        
        while(tail.next!=null)
            tail=tail.next;
        
       while(curr.next!=null)
       {
           if(i==l-n)
               break;
           
           
           prev=curr;
           curr=curr.next;
           i++;
       }
        
       prev.next=null;
        tail.next=head;
        
        
        
        return curr;
        
        
       
	}

}

// MAIN CODDE

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class Runner {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while (i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
    public static void print(LinkedListNode<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            LinkedListNode<Integer> head = takeInput(); 

            int n = Integer.parseInt(br.readLine().trim());
            head = Solution.appendLastNToFirst(head, n);
            print(head);

            t -= 1;
        }
        
    }
}
