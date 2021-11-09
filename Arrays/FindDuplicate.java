public class Solution{  

    public static int duplicateNumber(int arr[]){
		int n=arr.length;
        int i=0;
        for(i=0;i<n;i++)
        {
        for(int j=0;j<n;j++)
        { if(j!=i && arr[j]==arr[i])
                return arr[i];
        }     
        }
         return i; 
    }
  
}
