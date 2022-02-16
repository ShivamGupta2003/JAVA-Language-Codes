/*
Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.

Note: Array A can contain duplicate elements as well.

Input format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.

Output format :
The first and only line of output contains the count of pair of elements in the array which sum up to 0. 

Constraints :
0 <= N <= 10^4
Time Limit: 1 sec

Sample Input 1:
5
2 1 -2 2 3

Sample Output 1:
2
*/



// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE PROBLEM

import java.util.*;

public class Solution {
	public static int PairSum(int[] input, int size) {
		
      HashMap<Integer, Integer> map = new HashMap<>();
        int count=0;
		
        for(int i : input) {
			
			if(map.containsKey(-i) ) {
				for(int j=0;j<map.get(-i);j++) {
					count++;
				}
				
			}
			
			if(map.containsKey(i)) 
            {
				map.put(i, map.get(i) + 1);
			}
			
            else 
            {
				map.put(i, 1);
			}
            
		}
        return count;
	}
}


// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        int[] arr = takeInput();
        System.out.print(Solution.PairSum(arr,arr.length));


    }
}
