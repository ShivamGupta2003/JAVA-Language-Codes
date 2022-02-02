/*

For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. 
You just need to construct the tree and return the root.

Note:
Assume that the Binary Tree contains only unique elements. 

Input Format:
The first line of input contains an integer N denoting the size of the list/array. It can also be said that N is the total number of nodes the binary tree would have.
The second line of input contains N integers, all separated by a single space. It represents the Postorder-traversal of the binary tree.
The third line of input contains N integers, all separated by a single space. It represents the inorder-traversal of the binary tree.

Output Format:
The given input tree will be printed in a level order fashion where each level will be printed on a new line. 
Elements on every level will be printed in a linear fashion. A single space will separate them.

Constraints:
1 <= N <= 10^4
Where N is the total number of nodes in the binary tree.
Time Limit: 1 sec

Sample Input 1:
7
4 5 2 6 7 3 1 
4 2 5 1 6 3 7 

Sample Output 1:
1 
2 3 
4 5 6 7 

Sample Input 2:
6
2 9 3 6 10 5 
2 6 3 9 5 10 

Sample Output 2:
5 
6 10 
2 3 
9 

*/



// SOLUTION CLASS THAT CONTAINS FUNCTION TO SOLVE PROBLEM


public class Solution {

    public static int linearSearch(int arr[], int x) 
     {
        int i=0;
        int m=arr.length;
        for(i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
           break;
        }
  
        if(i==m)
           i=-1;
            
        return i;
        
    
    }
    
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		return buildTree(postOrder,inOrder,0,inOrder.length-1,0,postOrder.length-1);
	}

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder, int pos ,int poe, int ios , int ioe){
        
        if(pos>poe || ios>ioe)
            return null;
        
        int a=postOrder[poe];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(a);
        
        
        int l=linearSearch(inOrder,a);
         
       root.left=buildTree(postOrder,inOrder,pos,pos+l-ios-1,ios,l-1);
       root.right=buildTree(postOrder,inOrder,pos+(l-ios),poe-1,l+1,ioe); 
        
        return root;
	}
    
    
    
} 



// MAIN CLASS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

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

class Pair {
	int[] postOrder;
	int[] inOrder;

	public Pair(int[] postOrder, int[] inOrder) {
		this.postOrder = postOrder;
		this.inOrder = inOrder;
	}

}

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static Pair takeInput() throws NumberFormatException, IOException {
    	int n = Integer.parseInt(br.readLine().trim());

    	int pre[] = new int[n];
    	int in[] = new int[n];

    	String[] postOrder = br.readLine().trim().split(" ");
    	String[] inOrder = br.readLine().trim().split(" ");


    	for (int i = 0; i < n; i++) {
    		pre[i] = Integer.parseInt(postOrder[i].trim());
    		in[i] = Integer.parseInt(inOrder[i].trim());
    	}

    	return new Pair(pre, in);

    }

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
        pendingNodes.add(null);

		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

        
	        if (frontNode == null) {
	            System.out.println();

	            if (!pendingNodes.isEmpty()) {
	                pendingNodes.add(null);
	            }

	        } else {
	        	System.out.print(frontNode.data + " ");

	            if (frontNode.left != null) {
	                pendingNodes.add(frontNode.left);
	            } 

	            if (frontNode.right != null) {
	                pendingNodes.add(frontNode.right);
	            } 
	        }

		}
		
	}
    public static void main(String[] args) throws NumberFormatException, IOException {

    	Pair input = takeInput();

    	int[] postOrder = input.postOrder;
    	int[] inOrder = input.inOrder;

    	BinaryTreeNode<Integer> root = Solution.buildTree(postOrder, inOrder);

    	printLevelWise(root);

    }
}
