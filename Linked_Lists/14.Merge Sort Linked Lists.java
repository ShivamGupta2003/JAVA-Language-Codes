/*
Given a singly linked list of integers, sort it using 'Merge Sort.'

Note :
No need to print the list, it has already been taken care. Only return the new head to the list.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.

Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element

Output format :
For each test case/query, print the elements of the sorted singly linked list.
Output for every test case will be printed in a seperate line.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
Time Limit: 1sec

Sample Input 1 :
1
10 9 8 7 6 5 4 3 -1

Sample Output 1 :
 3 4 5 6 7 8 9 10 

Sample Output 2 :
2
-1
10 -5 9 90 5 67 1 89 -1

Sample Output 2 :
-5 1 5 9 10 67 89 90 
*/

//Solution class that contains functions for solving questions
public class Solution {

  //Length of LL Function
    public static int length(LinkedListNode<Integer> head){
		int i=0;
        while(head!=null){
            i++;
            head=head.next;}
        
      return i;

	}    
//Find Mid Function
    public static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head) {
        int l=length(head);
        
        if(head==null)
            return head;
       
        if(l%2!=0)
        {
            int i=0;
        while(i!=l/2){
            i++;
            head=head.next;}
        
      return head;

	}    
        
        else
        {
            int i=0;
        while(i!=(l/2)-1){
            i++;
            head=head.next;}
        
      return head;

	}    
        
    }
    
//Merge function
     public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
         if(head1==null)
        return head2;
    
         if(head2==null)
        return head1;
     
        
          LinkedListNode<Integer> temp1=head1;
          LinkedListNode<Integer> temp2=head2;
          LinkedListNode<Integer> temp=null;
          LinkedListNode<Integer> ans=null;
        
        if(head1.data<head2.data)
        {
            ans=head1;
            temp=ans;
            temp1=head1.next;
        }
        
        else 
        {
            ans=head2;
            temp=ans;
            temp2=head2.next;
        }
        
        
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                temp.next=temp1;
                temp1=temp1.next;
                temp=temp.next;
            }
            
            else
            {
                temp.next=temp2;
                temp2=temp2.next;
                temp=temp.next;
            }
            
        }
   
        if(temp1==null)
            temp.next=temp2;
        
        else if(temp2==null)
            temp.next=temp1;
        
    
    return ans;
    }
    
  //Merge Sort function that we wished to create
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		
        if(head==null || head.next==null)
            return head;
        
        LinkedListNode<Integer> mid=findMid(head);
        
        LinkedListNode<Integer> part2=mid.next;
        mid.next=null;
        LinkedListNode<Integer> part1=head;
        
        part1=mergeSort(part1);
        part2=mergeSort(part2);
        
         LinkedListNode<Integer> ans=merge(part1,part2);
        return ans;
        
	}
}

//Main Code
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
        while(i < datas.length && !datas[i].equals("-1")) {
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
    
    public static void print(LinkedListNode<Integer> head) {
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

            LinkedListNode<Integer> newHead = Solution.mergeSort(head);
            print(newHead);
            
            t -= 1;
        }

    }
}
