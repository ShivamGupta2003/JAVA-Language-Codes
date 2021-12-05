/* 
                             QUESTION
Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)*/


//                            FUNCTIONAL CODE
public class solution {
	public static int[][] subsets(int input[]) {
		
        if(input.length==0)
        {int[][] ans=new int[1][0];
        return ans;}
        
       
        
        int si[]=new int[input.length-1];
        int m=si.length-1; 
            for(int i=input.length-1;i>0;i--,m--)
                si[m]=input[i];
        
       
        int[][] smallAns=subsets(si);
        
        int[][] ans=new int[2*smallAns.length][];
        
        for(int i=0;i<smallAns.length;i++)
        {
            ans[i]=new int[smallAns[i].length];
            for(int j=0;j<ans[i].length;j++)
            {
                ans[i][j]=smallAns[i][j];
            }
        }
        
        for(int i=smallAns.length;i<ans.length;i++)
        {
            ans[i]=new int[smallAns[i-smallAns.length].length+1];
            ans[i][0]=input[0];
            for(int j=1;j<ans[i].length;j++)
            {
                ans[i][j]=smallAns[i-smallAns.length][j-1];
            }
        }
        
       
        
       return ans;
        
        }
}


//                MAIN CODE
import java.util.Scanner;

public class runner {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = solution.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}




