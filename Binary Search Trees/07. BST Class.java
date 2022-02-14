/*

Implement the BST class which includes following functions -
1. search
Given an element, find if that is present in BST or not. Return true or false.
2. insert -
Given an element, insert that element in the BST at the correct position. If element is equal to the data of the node, insert it in the left subtree.
3. delete -
Given an element, remove that element from the BST. If the element which is to be deleted has both children, replace that with the minimum element from right sub-tree.
4. printTree (recursive) -

Print the BST in ithe following format -
For printing a node with data N, you need to follow the exact format -
N:L:x,R:y
where, N is data of any node present in the binary tree. x and y are the values of left and right child of node N. Print the children only if it is not null.
There is no space in between.
You need to print all nodes in the recursive format in different lines.

*/


// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE OUR PROBLEM

public class BinarySearchTree {
	
	BinaryTreeNode<Integer> root;
	
    public BinarySearchTree() {
		root = null;
	}
    
   
    // OUR PRIVATE SEARCH FUNCTION
     private boolean search(BinaryTreeNode<Integer> root, int data) {
		
         if(root==null)
			return false;
         
         if(root.data == data) 
			return true;
		
         if(data < root.data) 
			return search(root.left,data);
		
         return search(root.right,data);
	}
    
    
    
    // OUR PRIVATE INSERT FUNCTION
      private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int data) {
		
          if(root==null){
			BinaryTreeNode<Integer> newNode =  new BinaryTreeNode<Integer>(data);
			return newNode;
          }
		
          if(data <=root.data) 
			root.left = insert(root.left, data);
		
          else 
			root.right = insert(root.right,data);
		
          return root;
	}
    
    
    // OUR PRIVATE DELETE FUNCTION
      private BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> root,int data){
		
		if(root==null) 
			return null;
		
		if(root.data==data) {
			
			if(root.left==null && root.right==null) 
				return null;
			
			else if(root.left==null) 
				return root.right;
				
			
			else if(root.right==null) 
				return root.left;
			
			else {				
				BinaryTreeNode<Integer> temp = root.right;
				
                while(temp.left!=null) 
					temp = temp.left;
				
				int tempData = temp.data;
				root.data = tempData;
				root.right = delete(root.right,tempData);
				return root;
			}
			
		}
		
		if( data <=root.data ) {
			
			root.left = delete(root.left, data);
			
		}
		else {
			root.right  = delete(root.right, data);
		}
		return root;
		
		
	}
    
    
    // our private print tree function
    private void printTree(BinaryTreeNode<Integer> root) {
		
        if (root==null)
			return;
		
        String ans="";
        ans+=root.data;
        ans+=':';
		// System.out.print(root.data+":");
		
         if(root.left!=null)
		{
             ans+="L:";
             ans+=root.left.data;
             ans+=",";
			// System.out.print("L:"+root.left.data+",");
		}
        
		if (root.right!=null) 
		{
             ans+="R:";
             ans+=root.right.data;
			// System.out.print("R:"+root.right.data);			
		}
        
        
		System.out.println(ans);
        
		printTree(root.left);
		printTree(root.right);
	}
    
    
	public boolean search(int data) {
		return search(root,data);
	}
		
    public void insert(int data) {
		root = insert(root,data);
	}
	
	public void remove(int data ) {
		root = delete(root,data);
	}
	
    public void printTree() {
		printTree(root);
	}
}

	
	



// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BinarySearchTree bst = new BinarySearchTree();
		int choice, input;
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			st = new StringTokenizer(br.readLine());
			choice = Integer.parseInt(st.nextToken());
			switch (choice) {
			case 1:
				input = Integer.parseInt(st.nextToken());
				bst.insert(input);
				break;
			case 2:
				input = Integer.parseInt(st.nextToken());
				bst.remove(input);
				break;
			case 3:
				input = Integer.parseInt(st.nextToken());
				System.out.println(bst.search(input));
				break;
			default:
				bst.printTree();
				break;
			}

		}
	}
}
