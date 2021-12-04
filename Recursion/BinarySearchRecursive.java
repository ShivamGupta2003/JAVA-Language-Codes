/*Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.*/

//fn code
public class solution {

     public static int binarySearch(int input[], int element) {
       return binarySearch(input,element,0,input.length-1);
	}
    
    public static int binarySearch(int input[],int element,int si,int ei){
        if(si>ei)
            return -1;
        
        int mi=(si+ei)/2;
        int smallAns=0;
  
    if(input[mi]==element)
        return mi;
    
    if(input[mi]>element)
    smallAns= binarySearch(input,element,si,mi-1);
    
    else if(input[mi]<element)
    smallAns= binarySearch(input,element,mi+1,ei);
    
    return smallAns;}
    
}


//main code
import java.util.Scanner;

public class runner {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(solution.binarySearch(input, element));
	}
}
