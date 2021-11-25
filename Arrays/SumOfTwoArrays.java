
public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	int n1=arr1.length;
        int n2=arr2.length;
        int n=output.length;
        int max=0;
        
        if(n1>=n2)
         max=n1+1;
        else
        max=n2+1;
        
        int carry=0;
        int element=0;
        int i=0;
        int j=0;
        int k=n-1;
        int sum=0;
    
        for(i=n1-1,j=n2-1;i>=0 && j>=0 && k>0;i--,j--)
        {
            sum=arr1[i]+arr2[j]+carry;
            carry=sum/10;
            element=sum%10;
            output[k]=element;
            k--;
        }
            
        
        while(i>=0)
        {
         
           sum=arr1[i]+carry;
            carry=sum/10;
            element=sum%10;
            output[k]=element;
            i--;
            k--;
        }
        
        while(j>=0 && k>0)
        {
            sum=arr2[j]+carry;
            carry=sum/10;
            element=sum%10;
            output[k]=element;
            j--;
            k--;
        }
        
        
        if(k==0)
        {
            if(carry!=0)
            output[k]=carry;
                
            else
            output[k]=0;
           
        }
        
       
        
        
    }
}
