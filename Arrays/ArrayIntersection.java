
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	int n1=arr1.length;
        int n2=arr2.length;
        int i=0;
        int j=0;
        for(i=0;i<n1;i++)
        {
            
        for(j=0;j<n2;j++)
        {  
            if(arr2[j]==arr1[i])
            { 
                System.out.print(arr2[j] + " ");
                arr2[j]=-5545;
              break;
            }
        }  
        }
         
  
        
        
    }
}
