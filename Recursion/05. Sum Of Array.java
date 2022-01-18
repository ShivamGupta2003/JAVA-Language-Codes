/*
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces

Output Format :
Sum

Constraints :
1 <= N <= 10^3

Sample Input 1 :
3
9 8 9

Sample Output 1 :
26

Sample Input 2 :
3
4 2 1

Sample Output 2 :
7    
*/


// Solution Class that contains functions for solving the question
public class Solution{
    public static int sum(int input[]) {
		  
        int[] smallInput= new int[input.length - 1];
        
         if(smallInput.length==0)
            return input[0];
        
        for(int i = 1; i<input.length; i++)
			smallInput[i - 1] = input[i];
      
           return input[0]+sum(smallInput);
       
	}
}


// Main Code
import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(Solution.sum(input));
	}
}
