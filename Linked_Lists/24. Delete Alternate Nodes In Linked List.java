/*
Given a Singly Linked List of integers, delete all the alternate nodes in the list.

Example:
List: 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
Alternate nodes will be:  20, 40, and 60.
Hence after deleting, the list will be:

Output: 10 -> 30 -> 50 -> null

Note :
The head of the list will remain the same. Don't need to print or return anything.

Input format :
The first and the only line of input will contain the elements of the Singly Linked List separated by a single space and terminated by -1.

Output Format :
The only line of output will contain the updated list elements.

Input Constraints:
1 <= N <= 10 ^ 6.
Where N is the size of the Singly Linked List
Time Limit: 1 sec

Sample Input 1:
1 2 3 4 5 -1

Sample Output 1:
1 3 5

Explanation of Sample Input 1: 2, 4 are alternate nodes so we need to delete them 

Sample Input 2:
10 20 30 40 50 60 70 -1

Sample Output 2:
10 30 50 70  
*/                                 
                                                 


//Solution Class that contains functions used for solving problem  
 public class Solution {

	 //Function that we wished to create that deletes alternate Nodes Iteratively
    public static void deleteAlternateNodes(Node<Integer> head) {
        
        if(head.next==null || head.next.next==null)
            return ;
        
        
        Node<Integer> p=null;
        Node<Integer> c=head;
        
        int count=0;
        
        while(c.next!=null)
        {
            
           if(count%2!=0)
           {  
               p.next=c.next;   
           }
            p=c;
            c=c.next;
            count++;
        }
        
         if(count%2!=0)
           {  p.next=null;
           }
        

	}
}

 
//Main Code:-

import java.util.Scanner;
class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.setData(data);
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

public class Runner {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        Node<Integer> list = input();
        Solution.deleteAlternateNodes(list);
        print(list);
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.next;
        }
    }

    public static Node<Integer> input() {
        int data = s.nextInt();

        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data!=-1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

}
  
  
  
  
                                                                  
  
  
  
  
