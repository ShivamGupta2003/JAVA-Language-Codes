import java.util.Scanner;
public class Main {
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for (int i = 1; i <= n; i++)
    {
      for (int j = 1; j <= n; j++)
      {
        
        if ( j == 1 && i>=(n+1)/2 ) 
          System.out.print(".");
          
        else if ( j == n && i>=(n+1)/2 ) 
          System.out.print(".");
       
        else if (i==(n+1)/2)
          System.out.print(".");
        
        else if(i+j==(n+3)/2)
          System.out.print(".");
        
        else if(j-i==n/2)
        System.out.print(".");
        
        else 
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
