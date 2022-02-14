/*

You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
If two or more elements contend for the maximum frequency, return the element which occurs in the array first.

Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.

Output Format :
The first and only line of output contains most frequent element in the given array.

Constraints:
0 <= N <= 10^8
Time Limit: 1 sec

Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 

Sample Output 1 :
2

Sample Input 2 :
3
1 4 5

Sample Output 2 :
1

*/


// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE PROBLEM
import java.util.HashMap;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer, Integer> frq = new HashMap<Integer,Integer>();
     
        for(int i:arr)
        {
            if(frq.containsKey(i))
                frq.put(i,frq.get(i)+1);
            
            else
            {
                frq.put(i,1);
            }
            
        }
        
        int maxf=-1;
        int max=-1;
         for(int i:arr)
        {
             if(frq.get(i)>maxf)
             {
                 maxf=frq.get(i);
                 max=i;
             }
        }
        
        
        
        return max;
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
        System.out.println(Solution.maxFrequencyNumber(arr));


    }
}
