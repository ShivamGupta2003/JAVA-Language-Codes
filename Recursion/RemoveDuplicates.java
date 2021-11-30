//fn code
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		   
        if(str.length() == 1)
			return str;
		
		String ans = "";
		
        String smallAns = removeConsecutiveDuplicates(str.substring(1));
        
        if(str.charAt(0) != str.charAt(1))
			ans+=str.charAt(0) ;
        


		return ans + smallAns;
	}

}

//runner code
import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(Solution.removeConsecutiveDuplicates(input));
    }
}
