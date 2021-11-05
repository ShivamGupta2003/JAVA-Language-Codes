import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(); 
        int j=1;
   
        int sum=0;
    for(int i=1;i<=n;i++)
    {sum=sum+i;
        for(j=1;j<=i-1;j++)
        { 
            System.out.print(j+"+");
        }
     System.out.print(i+"=");
        System.out.println(sum);}
    }  
    
    }
