/*Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.*/

// FUNCTIONAL CODE
public class solution {

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
} 


// RUNNER CODE
import java.util.Scanner;

public class runner {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}

//Time complexcity for merge sort is nlogn
