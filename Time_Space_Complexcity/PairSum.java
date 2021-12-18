//  QUESTION

You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
Note:
Given array/list can contain duplicate elements. 
  
  
  
  
// FUNCTIONAL CODE  
  public class Solution {	

	  public static int pairSum(int arr[], int x) {
    	int n=arr.length;
        int i=0;
        int j=0;
        int count=0;
        for(i=0;i<n;i++)
        {
            
        for(j=i+1;j<n;j++)
        {  
            if(arr[j]+arr[i]==x)
            {       
                count++;
             
            }
        }  
           
        }
         
   return count;
        
        
    }
}


// MAIN CODE
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
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] arr = takeInput();
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.pairSum(arr, num));

            t -= 1;
        }
    }
}
