/*
You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 
Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.

Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec
Where 'M' is the size of the singly linked list.

Sample Input 1 :
1
9 2 3 3 2 9 -1

Sample Output 1 :
true

Sample Input 2 :
2
0 2 3 2 5 -1
-1

Sample Output 2 :
false
true

Explanation for the Sample Input 2 :
For the first query, it is pretty intuitive that the the given list is not a palindrome, hence the output is 'false'.
For the second query, the list is empty. An empty list is always a palindrome , hence the output is 'true'.
*/

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


//Solution class that contains function to check whether Linked List is palindrome or not
public class Solution {

  
  // Function that creates reversed Linked List
    public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
		if(head==null){
            return head;
        }
        if(head.next==null){
            return new LinkedListNode<Integer>(head.data);
        }
       
        LinkedListNode<Integer> reversed_head = reverse(head.next);
        LinkedListNode<Integer> t=new LinkedListNode<>(head.data);
        LinkedListNode<Integer> temp = reversed_head;
            
        while(temp.next!=null)
        {
            temp=temp.next;
        }
      
      temp.next=t;

        return reversed_head;
	}
    
    
  //Function that compares two Linked List whether Identical or not
  public static boolean isIdentical(LinkedListNode<Integer> a,LinkedListNode<Integer> b)
{
    if (a == null && b == null)
        return true;
 
   
    if (a != null && b != null)
        return (a.data == b.data) &&
               isIdentical(a.next, b.next);
 
    return false;
}
    
    // Function that checks if Linked List is palindrome or not
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> reversed=reverse(head);
        return isIdentical(head,reversed);
	}

}

// MAIN CODE
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

public class Main{
    
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

            boolean ans = Solution.isPalindrome(head);
            System.out.println(ans);

            t -= 1;

        }
        
    }
}
