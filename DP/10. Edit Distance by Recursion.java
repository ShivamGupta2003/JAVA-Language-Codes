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

	
	public static int editDistance(String s1, String s2){
		return ed(s1,s2,s1.length(),s2.length());
	}

     public static int ed(String s, String t,int m,int n)
    {
         
        if(m==0){
            return n;
        }

        if(n==0){
            return m;
        }
          
        if(s.charAt(m-1)==t.charAt(n-1))
        {
            return ed(s,t,m-1,n-1);
        }
    
        else
        {
            int op1=ed(s,t,m,n-1);
            int op2=ed(s,t,m-1,n);
            int op3=ed(s,t,m-1,n-1);
            return 1+Math.min(op1,Math.min(op2, op3));
        }
    
        
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
