// QUESTION
/*You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.*/


// FUNCTIONAL CODE
public class Solution{  

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
    
    public static int findUnique(int[] arr){
      mergeSort(arr);
       
      
        for(int i=0;i<arr.length;i+=2)
        {
            if(i==arr.length-1)
                return arr[i];
            
            if(arr[i]!=arr[i+1])
                return arr[i];
        }
      return 0;  
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
            System.out.println(Solution.findUnique(arr));

            t -= 1;
        }
    }
}
