// QUESTION
/*You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
You need to print their intersection; An intersection for this problem can be defined when 
both the arrays/lists contain a particular value or to put it in other words, when there is 
a common value that exists in both the arrays/lists*/


// FUNCTIONAL CODE
public class Solution {

       public static void merge(int input[],int si,int ei){
        
        int arr[]=new int[ei-si+1];
        int mid=(si+ei)/2;
        int i=si;
        int j=mid+1;
        int k=0;
        
         while(i<=mid && j<=ei)
        {
            if(input[i]<input[j])
            {
                arr[k]=input[i];
                    i++;
            }
            
            else if(input[i]>=input[j])
            {
                arr[k]=input[j];
                j++;
            }
            
            k++;
        }
        
        
        while(i<=mid)
        {
            arr[k]=input[i];
            i++;
            k++;
        }
        
        while(j<=ei)
        {
            arr[k]=input[j];
            j++;
            k++;
        }
         
       for(int l=si;l<=ei;l++)
           input[l]=arr[l-si];
    }
    
	public static void mergeSort(int[] input){
		mergeSort(input,0,input.length-1);
        return;
        }
    
    public static void mergeSort(int[] input,int si,int ei){
        
        if(si>=ei)
            return;
        
        int mid=(si+ei)/2;
        
            mergeSort(input,si,mid);
            mergeSort(input,mid+1,ei);
        
       
        merge(input,si,ei);
	}
    
    
	public static void intersection(int[] arr1, int[] arr2) {
	   
    	int n1=arr1.length;
        int n2=arr2.length;
        mergeSort(arr1);
        mergeSort(arr2);
        int i=0;
        int j=0;
        for(i=0;i<n1;i++)
        {
            
        for(j=0;j<n2;j++)
        {  
            if(arr2[j]==arr1[i])
            { 
                System.out.print(arr2[j] + " ");
                arr2[j]=Integer.MIN_VALUE;
              break;
            }
        }  
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
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            Solution.intersection(arr1, arr2);
            System.out.println();

            t -= 1;
        }
    }
}
