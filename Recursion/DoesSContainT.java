// QUESTION

/*Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
Return true or false.
Do it recursively.
E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.*/





// FUNCTIONAL CODE

public class Solution {
	
    
    public static boolean checkSequence(String a, String b) {
		return checkSequence(a,b,0,0);
	}
    
     public static boolean checkSequence(String a, String b,int si,int l)
     {
         if(si==b.length())
             return true;
         
    for(int i=l;i<a.length();i++)
    {
      if(b.charAt(si)==a.charAt(i))
      {
          return checkSequence(a,b,si+1,i+1);
      }
    }
   
    return false;
}
}



// RUNNER CODE
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String large = s.nextLine();
		String small = s.nextLine();

		System.out.println(Solution.checkSequence(large, small));
	}
}
