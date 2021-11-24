
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
        
