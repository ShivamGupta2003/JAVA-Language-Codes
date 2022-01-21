/*
Given k, find the geometric sum i.e. 1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) using recursion.

Input format :
Integer k

Output format :
Geometric sum (upto 5 decimal places)

Constraints :
0 <= k <= 1000

Sample Input 1 :
3

Sample Output 1 :
1.87500

Sample Input 2 :
4

Sample Output 2 :
1.93750
*/




// Solution that contains functions for solving problem 
public class solution {
		
        public static double power(double n,double x){
        double a=n;
        double j=1;
        if (n!=0)
        {while(j<=x-1)
        {
           a=a*n;
           j=j+1;
        }
    }
        return a;
    }
     
        
        public static double findGeometricSum(int k){
        
            if(k==0)
                return 1;
            
            double m=findGeometricSum(k-1);
            return 1/(power(2,k))+m;
        
        
        
	}
}


// Main code
import java.text.DecimalFormat;
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = solution.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}

