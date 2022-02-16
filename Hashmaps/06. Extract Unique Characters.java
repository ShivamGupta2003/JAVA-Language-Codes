/*

Given a string S, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.

Input format:
The first and only line of input contains a string, that denotes the value of S.

Output format :
The first and only line of output contains the updated string, as described in the task.

Constraints :
0 <= Length of S <= 10^8
Time Limit: 1 sec

Sample Input 1 :
ababacd

Sample Output 1 :
abcd

Sample Input 2 :
abcde

Sample Output 2 :
abcde

*/



// SOLUTION CLASS THAT CONTAINS FUNCTION TO SOLVE PROBLEM

import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
		String x="";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {

			if(!map.containsKey(str.charAt(i))) {
				x+=str.charAt(i);
				map.put(str.charAt(i),1);
			}
		}
		return x;
	}
}





// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String takeInput() throws IOException {
        String str = br.readLine(); 
        return str;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        String str = takeInput();
        System.out.print(Solution.uniqueChar(str));


    }
}
