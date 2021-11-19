
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
	
        if(n==0 || m==0)
            return 0;
        
        return n+multiplyTwoIntegers(m-1,n);
	
	}
}
