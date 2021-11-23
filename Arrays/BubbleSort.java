
public class Solution {  

    public static void bubbleSort(int[] arr){
    int n=arr.length;

        for(int j=0;j<n-1;j++)
        {
    	for(int i=0;i<n-1;i+=1)
        {  if(arr[i]>arr[i+1])
        { int m=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=m;
        }
        }
        }
    }
}
