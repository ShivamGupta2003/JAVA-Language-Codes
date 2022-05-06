     
    // THIS IS SELECTION SORT ALGORITHM FUNCTION

 public class SelectionSort{
     public static void selection_sort(int[] arr){
         for(int i=0;i<arr.length;i++){
             int mini=arr[i];
             int minind=i;

             for(int j=i;j<arr.length;j++){
                 if(mini>arr[j]){
                     mini=arr[j];
                     minind=j;
                 }
             }

             int temp=arr[i];
             arr[i]=mini;
             arr[minind]=temp;
         }
     }
     

     public static void printArray(int arr[])
     {
         int n = arr.length;
         for (int i=0; i<n; ++i)
             System.out.print(arr[i]+" ");
         System.out.println();
     }


     // DRIVER CODE

     public static void main(String args[])
     {
         int arr[] = {64,25,12,22,11};
         selection_sort(arr);
         System.out.println("Sorted array");
         printArray(arr);
     }
 }


 /*

KEYPOINTS:-
Time Complexity: O(n2) as there are two nested loops.
Auxiliary Space: O(1) 
The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation. 
 
*/
