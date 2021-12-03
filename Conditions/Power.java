import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int a=x;
        int j=1;
        if (n!=0)
        {while(j<=n-1)
      {
       
                  a=a*x;
           j=j+1;
        }
         System.out.println(a);
        }
        else
            System.out.println(1);
    }
}
