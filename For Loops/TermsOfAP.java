import java.util.Scanner;
public class Main 
{
public static void main(String[] args) 
{

    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int count=0;
   for(int i=1;count<=n-1;i++)
   {
       if((3*i+2)%4!=0)
       {
        System.out.print((3*i+2)+" ");
        count++;
        }
       
   }
}
}

    
