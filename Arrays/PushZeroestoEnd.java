public class Solution {  

    public static void pushZerosAtEnd(int[] arr) {
      int n=arr.length;
      int i=0; 
      int end=n-1;
      int start=0;
      
            
    	for(i=0;i<n ;i++)
        
        {  
             int temp=arr[i];
            if(arr[i]!=0)
            {
                arr[i]=arr[start];
                arr[start]=temp;
                start++;
            }
            
        }
        
        
        
        }
    }

        
        
        
