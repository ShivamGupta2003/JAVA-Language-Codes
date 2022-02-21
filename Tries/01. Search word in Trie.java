/*
Implement the function SearchWord for the Trie class.
For a Trie, write the function for searching a word. Return true if the word is found successfully, otherwise return false
*/

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}


public class Trie {

	private TrieNode root;
	private int numWords;

	public Trie() {
		root = new TrieNode('\0');
		numWords = 0;
	}
	

	
	private boolean add(TrieNode root, String word){
		if(word.length() == 0){
			if(root.isTerminating) {
				return false;
			}
			else {
				root.isTerminating = true;
				return true;
			}
		}		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null){
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		return add(child, word.substring(1));
	}

	public void add(String word){
		if(add(root, word)) {
			numWords++;
		}
	}
	
 public boolean search(String word) {
        return search(root, word);
    }
	
      private boolean search(TrieNode root,String word) {
        if(word.length()==0) {
            if(root.isTerminating) {
                return true;
            }
            return false;
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child==null) {
            return false;
        }
        return search(child, word.substring(1));

    }
    
}







// MAIN CLASS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	
	public static void main(String[] args) throws IOException{
		Trie t = new Trie();
        String[] string = br.readLine().split("\\s");
        int choice = Integer.parseInt(string[0]);
        String word = "Null";
        if (string.length!=1)        
        {
            word = string[1];
        }
        		
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					t.add(word);
					break;
				case 2 : // search
					System.out.println(t.search(word));
					break;
				default :
						return;
			}
            string = br.readLine().split("\\s");
            choice = Integer.parseInt(string[0]);
            if (string.length!=1)
            {
                word = string[1];
            }
		}
	}

}
