public class Solution{
    public static int[] merge(int arr1[],int arr2[]){
        
        int n1=arr1.length;
        int n2=arr2.length;
        int arr[]=new int[n1+n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k]=arr1[i];
                    i++;
            }
            
            else if(arr1[i]>=arr2[j])
            {
                arr[k]=arr2[j];
                j++;
            }
            
            k++;
        }
        
        
        while(i<n1 )
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        
        while(j<n2 )
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
}
