//Write a recursive function that returns the sum of the digits of a given integer.
  
// FUNCTIONAL CODE
public class solution {

	public static int sumOfDigits(int input){
	
        if(input<=0)
            return 0;
        
        else
            return (input%10)+sumOfDigits(input/10);
	}
}

// MAIN CODE
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution.sumOfDigits(n));
	}
}

//         Time complexcity is O(logn) in which base of log is 10
