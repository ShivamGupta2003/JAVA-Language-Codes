
public class Solution {  

    public static void insertionSort(int[] arr) {
    	int n=arr.length;
        int j=0;
        
        for(int i=1;i<n;i++)
        {
           int x=arr[i];
            for(j=i-1;j>=0 && arr[j]>x;j--)
            {   
                arr[j+1]=arr[j];
            }
            arr[j+1]=x;
         }
        
    
    }
    }

