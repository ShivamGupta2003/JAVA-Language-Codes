//                                                                  QUESTION

/*Given an array A of size n and an integer K, return all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Integer n, Size of input array
Line 2 : Array elements separated by space
Line 3 : K*/



//  1ST METHOD BUT TIME COMPLEXICITY HIGH

// FUNCTIONAL CODE
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
    
    public static int sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        
        return sum;
    }
 
	
    public static int[][] subsetsSumK(int input[], int k) {
		int[][] subans=subsets(input);
        int m=0; 
        int arr[]=new int[0];
            for(int i=0;i<subans.length;i++)
{
    int l=sum(subans[i]);
    
    
    if(l!=k)
    {
        subans[i]=arr;
    }
     
}

        
     
        return subans;
	}
}

// MAIN CODE
import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = solution.subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}



// MUCH BETTER SOLUTION FOR FUNCTIONAL CODE
public class solution {
 	
    public static int[][] subsetsSumK(int input[], int k) {
		return subsetsSumK(input,k,0);
	}
    
     public static int[][] subsetsSumK(int input[],int k,int start) {
 
         if(start==input.length)
         {
            
             if(k==0)
         return new int[1][0];
             
             else 
         return new int[0][0];
         
                 
         }
         
         
         
         int[][] sa2=subsetsSumK(input,k-input[start],start+1);
         int[][] sa1=subsetsSumK(input,k,start+1);
         int[][] myans=new int[sa1.length+sa2.length][];
         
        int l=0;
         
         for(int i=0;i<sa1.length;i++,l++)
         {
             myans[l]=sa1[i];
         }
             
         for(int i=0;i<sa2.length;i++,l++)
         {
             myans[l]=new int[sa2[i].length+1];
             myans[l][0]=input[start];
             for(int j=0;j<sa2[i].length;j++)
                 myans[l][j+1]=sa2[i][j];
         }
         
         return myans;
}
}



