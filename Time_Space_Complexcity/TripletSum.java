// QUESTION

/*You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.*/


// FUNCTIONAL CODE approach 1 (TIME COMPLEXCITY=n^3)
public class Solution {	

	public static int tripletSum(int[] arr, int x) {
	int n=arr.length;
        int i=0;
        int j=0;
        int k=0;
        int count=0;
        for(i=0;i<n;i++)
        {
            
        for(j=i+1;j<n;j++)
        {  
            for(k=j+1;k<n;k++)
            {if(arr[j]+arr[i]+arr[k]==x)
            {       
                count++;
        
            }
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
            System.out.println(Solution.tripletSum(arr, num));

            t -= 1;
        }
    }
}


//fUNCTIONAL CODE APPROACH 2
