/*
Given two strings s and t of lengths m and n respectively, find the edit distance between the strings.
Edit Distance
Edit Distance of two strings is minimum number of operations required to make one string equal to other. In order to do so you can perform any of the following three operations only :
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note
Strings don't contain spaces
Input Format :
The first line of input contains a string, that denotes the value of s. The following line contains a string, that denotes the value of t.
Output Format :
The first and only line of output contains the edit distance value between the given strings.
Constraints :
1<= m,n <= 10
Time Limit: 1 second
Sample Input 1 :
abc
dc
Sample Output 1 :
2
*/



// SOLUTION CLASS THAT CONTAINS SOLUTION TO OLVE PROBLEM
	public class Solution {

	public static int editDistance(String s, String t) {
		
        int dp[][]=new int[s.length()+1][t.length()+1];
        
        for(int i=0;i<=s.length();i++)
            dp[i][0]=i;
        
        for(int j=0;j<=t.length();j++)
            dp[0][j]=j;
        
        for(int i=1;i<=s.length();i++)
        {
           for(int j=1;j<=t.length();j++) 
           {
               if(s.charAt(i-1)==t.charAt(j-1))
                   dp[i][j]=dp[i-1][j-1];
               
               else{
                   int op1=dp[i-1][j];
                   int op2=dp[i-1][j-1];
                   int op3=dp[i][j-1];
                   dp[i][j]=1+Math.min(op1,Math.min(op2, op3));
           }
        }
        
         
    }
           return dp[s.length()][t.length()];
}
}

    

// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
	
		String str1 = br.readLine().trim();
		String str2 = br.readLine().trim();
        System.out.println(Solution.editDistance(str1, str2));
        
	}
}
