import java.util.Scanner;
public class Solution {

    public static int linearSearch(int arr[], int x) {
        int i=0;
       
        for(i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
                return i;
        }
  
            
        return -1;
        
    
    }
}



// Worst case in linear search algorithm is when item is the last element in array or item is not present in array and time complexcity for worst case is O(n)
