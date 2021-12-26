import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int i=1;
        
            while(i<=n1)
            {
                int j=1;
                while(j<=n2)
                {
                    
                    System.out.print("*");
                        j++;
                }
                System.out.println();
                i++;
            }
        
		
		
		
	}

}
