     
    // THIS IS BUBBLE SORT ALGORITHM FUNCTION

    public class BubbleSort{
        public static void bubble_sort(int[] arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;;
                    }
                }
            }
        }

        // The above function always runs O(n^2) time even if the array is sorted. It can be optimized by stopping the algorithm if the inner loop didn’t cause any swap. 
        
    public static void bubble_sort_optimised(int arr[]){
        int i, j, temp;
        int n=arr.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
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
            bubble_sort(arr);
            System.out.println("Sorted array");
            printArray(arr);
            int arr2[] = {64,25,12,22,11};
            bubble_sort_optimised(arr2);
            printArray(arr2);
        }
    }
   
   
    /*
   
   KEYPOINTS:-
   Worst Case Analysis for Bubble Sort:
The worst-case condition for bubble sort occurs when elements of the array are arranged in decreasing order.
In the worst case, the total number of iterations or passes required to sort a given array is (n-1). where ‘n’ is a number of elements present in the array.

  At pass 1 :  Number of comparisons = (n-1)
                     Number of swaps = (n-1)

  At pass 2 :  Number of comparisons = (n-2)
                     Number of swaps = (n-2)

  At pass 3 :  Number of comparisons = (n-3)
                    Number of swaps = (n-3)
                              .
                              .
                              .
  At pass n-1 :  Number of comparisons = 1
                        Number of swaps = 1

Now , calculating total number of comparison required to sort the array
= (n-1) + (n-2) +  (n-3) + . . . 2 + 1
= (n-1)*(n-1+1)/2  { by using sum of N natural Number formula }
= n (n-1)/2    

For Worst case:

Total number of swaps = Total number of comparison
Total number of comparison (Worst case) = n(n-1)/2
Total number of swaps (Worst case) = n(n-1)/2

Worst and Average Case Time Complexity: O(n*n). The worst case occurs when an array is reverse sorted.
Best Case Time Complexity: O(n). The best case occurs when an array is already sorted.
Auxiliary Space: O(1)
Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
Sorting In Place: Yes
Stable: Yes
    
   */
   