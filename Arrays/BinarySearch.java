
public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	int start=0;
        int m=arr.length;
        int end=m-1;
       
        
        
        while(start<=end)
        {
        int mid=(start + end)/2;
        
        //= wali condition
        if(arr[mid]==x)
            return mid;
        
        // left wali condition
        else if(arr[mid]>x)
        {
            end=mid-1;
              
        }
            
        // right wali condition
        else if(arr[mid]<x)
        {
            start=mid+1;
           
        }
            
        }
   
        return -1;
    }
}
