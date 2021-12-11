/*Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.*/

//FUNCTIONAL CODE

public class Solution {
	
	public static void quickSort(int[] input) 
    {
		quickSort(input,0,input.length-1);
    }
    
  public static int partition(int input[],int si,int ei)
    {
      
        int arr[]=new int[ei-si+1];
        int pivot=input[si];
        int j=0;
        int pivot_index=0;
        int count=0;
        int rcount=arr.length-1;
        
            for (j=si;j<=ei;j++)
            {
                if(input[j]<pivot)
                {
                arr[count]=input[j];
                count++;
                }
                
                else if(input[j]>pivot)
                {
                    arr[rcount]=input[j];
                    rcount--;
                }  	
            }
          
       for (j=si;j<=ei;j++)
            {
                if(input[j]==pivot)
                {
                arr[count]=input[j];
                count++;
                }
        
            }
          pivot_index=si+count-1;
        
        for(int l=0;l<arr.length;l++)
        {
            input[l+si]=arr[l];}
         

	return pivot_index;

    }


    public static void quickSort(int[] input,int si,int ei) 
    {
    if(si>=ei)
            return; 
        
      int pi=partition(input,si,ei);
        

        quickSort(input,si,pi-1);
        quickSort(input,pi+1,ei);
    }
    
	
}

//RUNNER CODE
import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		Solution.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}
