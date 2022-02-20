/*

Given k different arrays, which are sorted individually (in ascending order). You need to merge all the given arrays such that output array should be sorted (in ascending order).

Hint : Use Heaps.

Input Format:
The first line of input contains an integer, that denotes value of k.
The following lines of input represent k sorted arrays. Each sorted array uses two lines of input. The first line contains an integer, that denotes the size of the array. The following line contains elements of the array.

Output Format:
The first and only line of output contains space separated elements of the merged and sorted array, as described in the task.

Constraints:
0 <= k <= 1000
0 <= n1, n2 <= 10000
Time Limit: 1 second

Sample Input 1:
4
3
1 5 9
2
45 90
5
2 6 78 100 234
1
0

Sample Output 1:
0 1 2 5 6 9 45 78 90 100 234

*/



// SOLUTION CLASS THAT CONTAINS FUNCTIONS TO SOLVE PROBLEM

import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

		ArrayList<Integer> ans=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
      
        
        for(int i=0;i<input.size();i++)
      {
          ArrayList<Integer> temp=input.get(i);
     
          for(int j=0;j<temp.size();j++)
          pq.add(temp.get(j));
          
      }
    
       while(!pq.isEmpty())
            ans.add(pq.remove());
        return ans;
    }

}

	

// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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




	public static void main(String[] args) throws IOException {
		int k = Integer.parseInt(br.readLine().trim());
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		while(k > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			ArrayList<Integer> current = new ArrayList<Integer>();
            String[] strNums;
            strNums = br.readLine().split("\\s");
            for(int i = 0; i < n; i++) {
				current.add(Integer.parseInt(strNums[i]));
			}
			input.add(current);
			k--;
		}
        ArrayList<Integer> output = Solution.mergeKSortedArrays(input);
        if (output!=null){
            for(int i : output) {
                System.out.print(i + " ");
            }
        }

	}
}

