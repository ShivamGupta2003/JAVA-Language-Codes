import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);;
    int n=s.nextInt();
        
        if (n==2 || n==1)
        System.out.println(1);
        
        else 
        {
         int a=1;
         int b=1;
         int c=a+b;
             for(int d=3;d<=n-1;d++)
             {
             a=b;
             b=c;
             c=a+b;
             }
             System.out.println(c);
             }

                 
        }


		
	}

