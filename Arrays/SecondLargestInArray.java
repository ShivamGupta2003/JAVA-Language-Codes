public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	
        int n=arr.length;
       int max=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;
      int a=0;
    int l=0;
        
        
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])
                a=Integer.MIN_VALUE;
            else
                a=arr[i+1];
        }
        
        if(n<=1 || a==Integer.MIN_VALUE)
            return max;
        
        
        
        for(int i=0;i<n;i++)
    {
        if(arr[i]>max)
        {max=arr[i];}
    }
        
    

        for(l=0;l<n;l++)
        {if(arr[l]==max)
        {arr[l]=Integer.MIN_VALUE;}
        }
        
        
        

         for(int i=0;i<n;i++)
    {
        if(arr[i]>max2)
        {max2=arr[i];}
    }
  
        
return max2;
    }

}
