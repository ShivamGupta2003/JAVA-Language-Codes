import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int a=0;
        int b=0;
        
    
            while(n>0)
            {
                    int l= n % 10;
                        
                        if(l%2==0)
                             a=a+l;
                            
                            else
                                b=b+l;
                                
                                n=n/10;
            }
        System.out.print(a+" "+ b);


	}
}
