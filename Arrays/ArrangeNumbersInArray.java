
public class Solution {
    
    public static void arrange(int[] arr, int n) {
    int start=0;
    int end=n-1;
    
     for(int k=1;k<=n;k+=2)
     {
         arr[start]=k;
         
         if(start!=end)
         {arr[end]=k+1;}
         start++;
         end--;
     }
            
            
        }  
}
