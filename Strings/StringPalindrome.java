/*Given a string, determine if it is a palindrome, considering only alphanumeric characters.
Palindrome
A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
Example:
If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and backwards, it is said to be a valid palindrome.

The expected output for this example will print, 'true'.
From that being said, you are required to return a boolean value from the function that has been asked to implement.*/




// FUNCTIONAL CODE
public class Solution {

    public static String reverseString(String str){
        String reversedString="";
        
        for(int i=str.length()-1;i>=0;i--)
        { reversedString+=str.charAt(i); }
    
    return reversedString;}
    
	
    
    
    public static boolean isPalindrome(String str) {
		String reverse=reverseString(str);

            if(str.equals(reverse))
                return true;
        
        return false;
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

		boolean ans = Solution.isPalindrome(str);
		System.out.println(ans);
	}
}
