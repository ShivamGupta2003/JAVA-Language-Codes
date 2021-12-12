// QUESTION
/*Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.*/


// FUNCTIONAL CODE
public class Solution {  

    public static void selectionSort(int[] arr) {
    
     int n=arr.length;
      
        for(int i=0;i<n-1;i++)
        {
            int min=arr[i];
            int minInd=i;
            for(int j=i+1;j<n;j++)
            {
               if(arr[j]<min)
                {
                    min=arr[j];
                        minInd=j;
                }
            }
            if(minInd!=i)
            {arr[minInd]=arr[i];
            arr[i]=min;}
        }
        
        
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

            int[] input = takeInput();
            Solution.selectionSort(input);
            printArray(input);

            t -= 1;
        }
    }
}


//Worst case time complexcity of Selection sort is O(n^2)
