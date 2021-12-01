/*A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. 
Implement a method to count how many possible ways the child can run up to the stairs. 
You need to return number of possible ways W.*/

// FUNCTIONAL CODE IS AS FOLLOWS:-
public class Solution {	
     public static int staircase(int n){
	
         if(n==0)
             return 1;
         
         else if(n<0)
             return 0;
         
         
         int sa1=staircase(n-1);
             
         int sa2=staircase(n-2);
            
         int sa3=staircase(n-3);
             return sa3+sa2+sa1;
      
	}
}

// RUNNER CODE IS AS FOLLOWS:-
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.staircase(n));
	}
}
