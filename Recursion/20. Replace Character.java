/*

Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.

Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)

Output Format :
Updated string

Constraints :
1 <= Length of String S <= 10^6

Sample Input :
abacd
a x

Sample Output :
xbxcd

*/


// Solution Class that contains function for solving problem

public class Solution {

	public static String replaceCharacter(String str, char c1, char c2) {
		
        if(str.length() == 0){
			return str;
		}
		String ans = "";
		
        if(str.charAt(0) != c1)
			ans = ans + str.charAt(0);	
        
		else if(str.charAt(0)==c1)
            ans=ans+c2;
        
        
		String smallAns = replaceCharacter(str.substring(1),c1,c2);
		return ans + smallAns;
	}
}




// Main Class

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(Solution.replaceCharacter(input, c1, c2));
	}
}
