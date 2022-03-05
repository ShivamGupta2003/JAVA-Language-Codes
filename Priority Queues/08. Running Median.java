/*

You are given a stream of 'N' integers. For every 'i-th' integer added to the running list of integers, print the resulting median.
Print only the integer part of the median.

Input Format :
The first line of input contains an integer 'N', denoting the number of integers in the stream.
The second line of input contains 'N' integers separated by a single space.

Output Format :
Print the running median for every integer added to the running list in one line (space-separated).

Input Constraints
0 <= N <= 10 ^ 5
1 <= ARR[i] <= 10 ^ 5
Time Limit: 1 sec

Sample Input 1 :
6
6 2 1 3 7 5

Sample Output 1 :
6 4 2 2 3 4

Explanation of Sample Output 1 :
S = {6}, median = 6
S = {6, 2} -> {2, 6}, median = 4
S = {6, 2, 1} -> {1, 2, 6}, median = 2
S = {6, 2, 1, 3} -> {1, 2, 3, 6}, median = 2
S = {6, 2, 1, 3, 7} -> {1, 2, 3, 6, 7}, median = 3
S = {6, 2, 1, 3, 7, 5} -> {1, 2, 3, 5, 6, 7}, median = 4

Sample Input 2 :
5
5 4 3 2 1

Sample Output 2 :
5 4 4 3 3

*/



import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

public class Solution {


    
	public static void findMedian(int arr[])  {
        
		PriorityQueue<Integer> min = new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i : arr) {
			
			if(max.isEmpty()) {
				max.add(i);
			}
			else if( i  > max.peek() ) {
				min.add(i);
				if( (min.size() - max.size()) > 1 ) {
					int p = min.remove();
					max.add(p);
				}
			}
			else {
				max.add(i);
				if( (max.size() -min.size()) > 1  ) {
					int p = max.remove();
					min.add(p);
				}
			}
			
			if(max.size() > min.size()) {
				System.out.print(max.peek()+" " );
			}
			else if(max.size() < min.size()) {
				System.out.print(min.peek()+" " );
			}
			else {
				System.out.print( (max.peek() + min.peek()) /2 +" " );
			}
			
			
		}
		
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
        Solution.findMedian(arr);


    }
}
