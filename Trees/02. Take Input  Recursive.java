import java.util.ArrayList;
import java.util.Scanner;

// Tree Node Class
class TreeNode<T> {
	public T data;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}
	
}



// Implementing Tree Use Class by taking input using recursion
public class TreeUse {
	
	public static TreeNode<Integer> takeInput(Scanner s) {
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for " + n);
		int childCount = s.nextInt();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	

	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		TreeNode<Integer> root = takeInput(s);
	
System.out.println(root);
	}
}
