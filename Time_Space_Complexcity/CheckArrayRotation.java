//Question
/*You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some number 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.*/

//Functional Code
public class Solution {

    
    
    public static int arrayRotateCheck(int[] arr){
    	int i=0;
       int n=arr.length;
        
       
        
        
        
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
                return i+1;
        }
        
        
        return 0;
        
        
        
    }

}

//Main code
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

            int[] input = takeInput();
            int ans = Solution.arrayRotateCheck(input);
            System.out.println(ans);

            t -= 1;
        }
    }
}
