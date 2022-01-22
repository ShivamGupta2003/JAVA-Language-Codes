/*

Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

Input format :
String S

Output format :
Modified string

Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.

Sample Input 1 :
hello

Sample Output 1:
hel*lo

Sample Input 2 :
aaaa

Sample Output 2 :
a*a*a*a

*/


// Solution Class that contains function for solving problem

public class solution {

	// Return the updated string
	public static String addStars(String input) {
		 
        if(input.length()<=1)
            return input;
        
        String smallAns=input.substring(1);
        
        if(input.charAt(0)==smallAns.charAt(0))
            return input.charAt(0)+"*"+addStars(smallAns);
        
        else
            return input.charAt(0)+addStars(smallAns);
        
        
	}
}



// Main Code
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.addStars(input));
	}
}
