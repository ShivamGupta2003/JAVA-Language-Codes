public class Solution {

	public static void leaders(int[] input) {
        int n=input.length;
        int i=0;
        int j=0;
		 for (i = 0; i < n; i++)
        {
            
            for (j = i + 1; j <n; j++)
            {
                if (input[i]<input[j])
                    break;
            }
            if (j == n) 
                System.out.print(input[i] + " ");
        }
	}
	
}
