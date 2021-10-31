import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int S=s.nextInt();
        int E=s.nextInt();
        int W=s.nextInt();
            int i=S;
        
            while(i<=E)
            {
                int j=((5*(i-32))/9);
                  System.out.println(i+" "+j);
             i=i+W ; 
              
        }
		
		
	}

}
