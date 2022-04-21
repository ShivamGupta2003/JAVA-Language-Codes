
public class Solution {

    public static void sort012(int[] arr){
    	 int n=arr.length;
      int i=0; 
      int end=n-1;
      int start=0;
      
            
    	for(i=0;i<n;)
        
        {  
             int temp=arr[i];
            
            if(arr[i]==0 && i>=start)
            {
                arr[i]=arr[start];
                arr[start]=temp;
                
                if(arr[start]!=0)
                i++;
                
                start++;
                
                
            }
            
            else if(arr[i]==2 && i<=end)
            {
                arr[i]=arr[end];
                arr[end]=temp;
                
                if(arr[end]!=2)
                    i++;
                
                end--; 
               
                
            }
            
            else
                i++;
            
            
            
        }
        
        
        
        }
    }

        
        
        
