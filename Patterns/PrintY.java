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
        if (i+j==n+1 && i<=(n+1)/2) 
          System.out.print(".");
          
        else if (i==j && i<=(n+1)/2)
          System.out.print(".");
          
        else if (j==(n+1)/2 && i>=(n+1)/2) 
          System.out.print(".");
        
        
        else 
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
