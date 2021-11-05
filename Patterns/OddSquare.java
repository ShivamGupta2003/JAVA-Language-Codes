import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=n;i++) {
        
           for(int j=i;j<=n;j++)
           {
           int a= 2*j-1;
           System.out.print(a);
           a=a+2;
            }
        
             int k=1;
            for(int p=1;p<=i-1;p++) 
            {
               
                System.out.print(k);
                k=k+2;
            }
            
            System.out.println();

                    
        }

    }
}
