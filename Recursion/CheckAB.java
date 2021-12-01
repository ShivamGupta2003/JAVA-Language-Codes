/*Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:-
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.*/

//functional code
public class Solution {

	public static boolean checkAB(String input) {
		
        if(input.length()==0){
            return true;
    	}
    
        
        if (input.charAt(0) != 'a')
        {
            return false;
        }
    
    
        if ( input.length() >= 3 && input.substring(0,3).equals("abb")  )
        {
            return checkAB(input.substring(3));
        }
        else
        {
            return checkAB(input.substring(1));
        }
        
	}
}




//RUNNER code
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(Solution.checkAB(input));
	}

}
