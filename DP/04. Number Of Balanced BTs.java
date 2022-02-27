/*

Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
This number can be huge, so, return output modulus 10^9 + 7.
Write a simple recursive solution.
Input Format :
The first and only line of input contains an integer, that denotes the value of h. Here, h is the height of the tree.
Output Format :
The first and only line of output contains the count of balanced binary trees modulus 10^9 + 7.
Constraints :
1 <= h <= 24
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315

*/

// SOLUTION CLASS 
/*
    Time complexity: O(2^N)
    Space complexity: O(N)

    where N is the final height of the binary tree
*/

public class Solution {

	public static long balancedBTs(long height){

        
         if (height == 0 || height == 1)
             return 1;
        
        int mod = (int)Math.pow(10, 9) + 7;
        
        long x = (long)balancedBTs(height-1);
		long y =(long)balancedBTs(height-2);
		
		long x_2 = (x*x)%mod;
		long x_y = (x*y)%mod;
		long x_y_2 = (2*x_y)% mod ;
		return (int)(x_2+x_y_2)%mod;
		
        
    
	}
}
        





// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws NumberFormatException, IOException {


        long n = Integer.parseInt(br.readLine().trim());
        System.out.print(Solution.balancedBTs(n));


    }
}
