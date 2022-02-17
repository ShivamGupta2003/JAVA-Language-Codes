/*

Given an array consisting of positive and negative integers, find the length of the longest subarray whose sum is zero.

Input Format:
The first line of input contains an integer, that denotes the value of the size of the array. Let us denote it with the symbol N.
The following line contains N space separated integers, that denote the value of the elements of the array.

Output Format
The first and only line of output contains length of the longest subarray whose sum is zero.

Constraints:
0 <= N <= 10^8

Time Limit: 1 sec

Sample Input 1:
10 
95 -97 -387 -435 -5 -70 897 127 23 284

Sample Output 1:
5

Explanation:
The five elements that form the longest subarray that sum up to zero are: -387, -435, -5, -70, 897 

*/



// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE PROBLEM
import java.util.HashMap;
public class Solution {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		int maxCount = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int index = 0;
		for(int i : arr) {
			sum += i;
			
			if(sum==0) 
			{
				int count = index+1;
				if(count > maxCount) 
			{
					maxCount = count;
				}
			}
            
			if(map.containsKey(sum)) {
				int count = index - map.get(sum) ;
				if(count > maxCount) {
					maxCount = count;
				}
			}
            
			else 
            {
				map.put(sum, index);
			}
            
			index++;
		}


		return maxCount;
	}
}



// MAIN CLASS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(Solution.lengthOfLongestSubsetWithZeroSum(arr));
	}

}
