/*For a given input string(str), write a function to print all the possible substrings.
	Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous*/


// FUNCTIONAL CODE
public class Solution {

	public static int countWords(String str) {	
        int a=0;
        
        if(str.length()==0)
            return 0;
        
		for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            { a++;
            }
            
        }
    
         a++;
        return a;
	}

}


// MAIN CODE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = br.readLine();
		if (str != null) {
			str = str.trim();
		} else {
			str = "";
		}

		Solution.printSubstrings(str);
		
	}
}
