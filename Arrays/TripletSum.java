
public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	int n=arr.length;
        int i=0;
        int j=0;
        int k=0;
        int count=0;
        for(i=0;i<n;i++)
        {
            
        for(j=i+1;j<n;j++)
        {  
            for(k=j+1;k<n;k++)
            {if(arr[j]+arr[i]+arr[k]==x)
            {       
                count++;
        
            }
        }  
           
        }
        }
         
   return count;
        
        
    }
}


