import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(); 
    for(int i=1;i<=n;i++)
    {
     for(int j=1;j<=n;j++)

    {
    if(i+j-1>=n)
    System.out.print(i+j-n);
         else 
             System.out.print(" ");
    }  
    System.out.println();
    }
    }
}
