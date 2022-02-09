/*

For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.
If you see in the above-depicted picture of Binary Tree, we see that there are a total of two paths, starting from the root and ending at the leaves which 
sum up to a value of K = 13.

The paths are:
a. 2 3 4 4
b. 2 3 8

One thing to note here is, there is another path in the right sub-tree in reference to the root, which sums up to 13 but since it doesn't end at the leaf, we discard it.
The path is: 2 9 2(not a leaf)

Input Format:
The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root,
it will not be a part of the node data. The second line of input contains an integer value K.

Output Format:
Lines equal to the total number of paths will be printed. All the node data in every path will be printed in a linear fashion taken in the order they appear from top to down bottom in the tree. A single space will separate them all.

Constriants:
1 <= N <= 10^5
0 <= K <= 10^8
Where N is the total number of nodes in the binary tree.
Time Limit: 1 second

Sample Input 1:
2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
13

Sample Output 1:
2 3 4 4 
2 3 8

Sample Input 2:
5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
13
 
Sample Output 2:
5 6 2
5 7 1

*/












// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE PROBELM


public class Solution {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		    rootToLeafPathsSumToK(root, k,"");

    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String output) {

    	 if(root==null){
             return ;
         }
    	
        if(k==root.data && root.left==null && root.right==null) {
            System.out.println(output+root.data);
            return ;
        }
       
        rootToLeafPathsSumToK(root.left, k - root.data, output + root.data+" " );
        rootToLeafPathsSumToK(root.right, k - root.data, output + root.data+" " );


    }
}











// MAIN CLASS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class QueueEmptyException extends Exception {

}

 class QueueUsingLL<T> {

	class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}

	public T front() throws QueueEmptyException{
		if(size == 0){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}

		return head.data;
	}


	public void enqueue(T element){
		Node<T> newNode = new Node<T>(element);

		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}

		size++;
	}

	public T dequeue() throws QueueEmptyException{
		if(head == null){
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
}


class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Runner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static BinaryTreeNode<Integer> takeInput() throws NumberFormatException, IOException {
		QueueUsingLL<BinaryTreeNode<Integer>>  pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>(); 
		int start = 0;

		String[] nodeDatas = br.readLine().trim().split(" ");

		if (nodeDatas.length == 1) {
			return null;
		}

		int rootData = Integer.parseInt(nodeDatas[start]);
		start += 1;

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while(!pendingNodes.isEmpty()){
			BinaryTreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}

			int leftChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(leftChildData != -1){
				BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(leftChildData);
				currentNode.left = leftChild;
				pendingNodes.enqueue(leftChild);
			}

			int rightChildData = Integer.parseInt(nodeDatas[start]);
			start += 1;

			if(rightChildData != -1){
				BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(rightChildData);
				currentNode.right = rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}

		return root;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BinaryTreeNode<Integer> root = takeInput();
		int k = Integer.parseInt(br.readLine().trim());

		Solution.rootToLeafPathsSumToK(root, k);
	}
}
