public class Solution{
    public static void sortZeroesAndOne(int[] arr){
    
      int n=arr.length;
      int j=0;
      int i=0;  
    	for(i=0;i<n ;i++)
        
        {  
            if(arr[i]==0)   
            { int m=arr[j];
            arr[j]=arr[i];
            arr[i]=m;
             j++;
            }
            
        }
        
        
        }
    }

        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        
