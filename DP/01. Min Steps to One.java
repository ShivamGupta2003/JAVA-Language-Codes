/*

Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
1.) Subtract 1 from it. (n = n - 1) ,
2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).  
Write brute-force recursive solution for this.

Input format :
The first and the only line of input contains an integer value, 'n'.

Output format :
Print the minimum number of steps.

Constraints :
1 <= n <= 200
Time Limit: 1 sec

Sample Input 1 :
4

Sample Output 1 :
2 

Explanation of Sample Output 1 :
For n = 4
Step 1 :  n = 4 / 2  = 2
Step 2 : n = 2 / 2  =  1 

Sample Input 2 :
7

Sample Output 2 :
3

Explanation of Sample Output 2 :
For n = 7
Step 1 :  n = 7 - 1 = 6
Step 2 : n = 6  / 3 = 2 
Step 3 : n = 2 / 2 = 1  

*/


// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE OUR PRBOLEM



// RECURSIVE SOLUTION 

public class Solution {

	public static int countMinStepsToOne(int n) {
        return countMinStepsToOne(0,n);
	}

    
    
    
    public static int countMinStepsToOne(int count,int n) {
       
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        
        if(n==1)
            return count;
        
        
        if(n%3==0)
            a=countMinStepsToOne(count+1,n/3);
        
        if(n%2==0)
            b=countMinStepsToOne(count+1,n/2);
        
            c=countMinStepsToOne(count+1,n-1);
        
        
        
        return Math.min(Math.min(a,b),c);
        
        
	}

    
}



// DP SOLUTION

	public static int countMinStepsToOne(int n) {
		int storage[]=new int[n+1];
        
        for(int i=2;i<=n;i++)
        {
            int min=storage[i-1];
            
            if(i%3==0)
                if(min>storage[i/3])
                    min=storage[i/3];
            
            
             if(i%2==0)
                if(min>storage[i/2])
                    min=storage[i/2];
            
            storage[i]=1+min;
        }
         return storage[n];   
        }
        
        
      
	}
    
    
  
// MAIN CLASS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.countMinStepsToOne(n));
    }
}
