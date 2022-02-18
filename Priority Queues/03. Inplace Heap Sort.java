/*

Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
Note: Space complexity should be O(1).

Input Format:
The first line of input contains an integer, that denotes the value of the size of the array or N.
The following line contains N space separated integers, that denote the value of the elements of the array.

Output Format :
The first and only line of output contains array elements after sorting. The elements of the array in the output are separated by single space.

Constraints :
1 <= n <= 10^6
Time Limit: 1 sec

Sample Input 1:
6 
2 6 8 5 4 3

Sample Output 1:
8 6 5 4 3 2

*/




// SOLUTION CLAS THAT CONTAINS FUNCTIONS TO SOLVE OUR PROBLEM


public class Solution {

	public static void placeIntoHeap(int[] arr , int i) {
		
		int childIndex = i;
		
		while(childIndex>0) {
			int parentIndex = (childIndex-1)/2;
			if(arr[childIndex] > arr[parentIndex] ) {
				int temp = arr[childIndex];
				arr[childIndex]= arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex  = parentIndex;
			}
			else {
				break;
			}
		}
		
		
	}
	public static int removeMaxFromHeap(int[] input,int size) {
		
		int temp = input[0];
		input[0] = input[size-1];
		
		int parentIndex = 0;
		int leftChildIndex = 2 * parentIndex + 1;
		int rightChildIndex = 2* parentIndex + 2;
		
		while(leftChildIndex < size) {
			
			int maxIndex = parentIndex;
			if(input[leftChildIndex] > input[maxIndex] ) {
				maxIndex = leftChildIndex;
			}
			if( rightChildIndex < size &&  input[rightChildIndex] > input[maxIndex]) {
				maxIndex = rightChildIndex;
			}
			if(maxIndex!=parentIndex) {
				int temp2 = input[maxIndex];
				input[maxIndex] = input[parentIndex];
				input[parentIndex] = temp2;
				parentIndex = maxIndex;
				leftChildIndex = 2 * parentIndex + 1;
				rightChildIndex = 2* parentIndex + 2;
			}
			else {
				break;
			}
			
		}
		
		return temp;
		
		
	}
	public static void inplaceHeapSort(int input[]) {
	
		for(int i=0;i<input.length;i++) {
			placeIntoHeap(input, i);
		}
		
		for(int i=0;i<input.length;i++) {
			input[ input.length-i-1] = removeMaxFromHeap(input, input.length - i); 
		}
		 for(int i=0;i<input.length/2;i++){
	            int temp = input[i];
	            input[i] = input[input.length - i -1];
	            input[input.length - i -1 ] = temp;
	        }
		
		
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
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		Solution.inplaceHeapSort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

}
