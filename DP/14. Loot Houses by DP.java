/*

A thief wants to loot houses. He knows the amount of money in each house. He cannot loot two consecutive houses. Find the maximum amount of money he can loot.

Input format :
The first line of input contains an integer value of 'n'. It is the total number of houses.
The second line of input contains 'n' integer values separated by a single space denoting the amount of money each house has.

Output format :
Print the the maximum money that can be looted.

Constraints :
0 <= n <= 10 ^ 4
Time Limit: 1 sec

Sample Input 1 :
6
5 5 10 100 10 5

Sample Output 1 :
110

Sample Input 2 :
6
10 2 30 20 3 50

Sample Output 2 :
90

Explanation of Sample Output 2 :
Looting first, third, and the last houses([10 + 30 + 50]) will result in the maximum loot, and all the other possible combinations would result in less than 90.

*/



// SOLUTION  CLASS THAT CONTAINS FUNCTIONS TO SOLVE OUR PROBLEM

public class Solution {

	public static int maxMoneyLooted(int[] houses) {
        if(houses.length==1)
            return houses[0];
        
        if(houses.length==0)
            return 0;
        
        else
            return maxMoneyLooted(houses,houses.length);
	}
    
    public static int maxMoneyLooted(int[] arr,int n)
    {
      if(n<=0) {
			return 0;
		}
		return Math.max( maxMoneyLooted(arr, n-1)  , arr[n-1] + maxMoneyLooted(arr, n-2)  );
		
	}
}


// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws IOException {
		int n = Integer.parseInt(br.readLine().trim());

		if (n == 0) {
			return new int[0];
		}

		String[] strNums = br.readLine().trim().split("\\s");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strNums[i]);
        }

        return arr;
	}

    public static void main(String[] args) throws NumberFormatException, IOException {
            int[] arr = takeInput();
            System.out.println(Solution.maxMoneyLooted(arr));
    }
}
