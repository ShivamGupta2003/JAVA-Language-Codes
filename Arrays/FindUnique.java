public class Solution{  

    public static int findUnique(int[] arr){
		int n=arr.length;
        int i=0;
        int j=0;
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        {
           
            
            if(j!=i && arr[j]==arr[i] )    
            {break;}
            
        }
          
          if(j==n)
        return arr[i];
       
            
            
        }
         return 0;
        
        
    } 
}
