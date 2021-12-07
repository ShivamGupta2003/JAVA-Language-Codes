//                                                     QUESTION

/*Given an array A and an integer K, print all subsets of A which sum to K.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print them in different lines.*/



//  FUNCTIONAL CODE
public class solution {
	
     public static int[][] subsetsSumK(int input[],int k,int start) {
 
         if(start==input.length)
         {
            
             if(k==0)
         return new int[1][0];
             
             else 
         return new int[0][0];
         
                 
         }
         
         
         
         int[][] sa2=subsetsSumK(input,k-input[start],start+1);
         int[][] sa1=subsetsSumK(input,k,start+1);
         int[][] myans=new int[sa1.length+sa2.length][];
         
        int l=0;
         
         for(int i=0;i<sa1.length;i++,l++)
         {
             myans[l]=sa1[i];
         }
             
         for(int i=0;i<sa2.length;i++,l++)
         {
             myans[l]=new int[sa2[i].length+1];
             myans[l][0]=input[start];
             for(int j=0;j<sa2[i].length;j++)
                 myans[l][j+1]=sa2[i][j];
         }
         
         return myans;
}
  
    public static void printSubsetsSumTok(int input[], int k) {
		
        
        int output[][] = subsetsSumK(input,k,0);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}

// MAIN CODE
import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		solution.printSubsetsSumTok(input, k);
	}
}


