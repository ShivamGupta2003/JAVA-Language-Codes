public class Solution {  

    public static int pairSum(int arr[], int x) {
    	int n=arr.length;
        int i=0;
        int j=0;
        int count=0;
        for(i=0;i<n;i++)
        {
            
        for(j=i+1;j<n;j++)
        {  
            if(arr[j]+arr[i]==x)
            {       
                count++;
             
            }
        }  
           
        }
         
   return count;
        
        
    }
}
