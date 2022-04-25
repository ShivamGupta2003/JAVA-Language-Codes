import java.util.Scanner;
public class Main 
{
public static void main(String[] args) 
{

    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=s.nextInt();
    
    if (c==1)
    {
       int a=0;
           for(int i=1;i<=n;i++)
           {a=a+i;} 
             System.out.println(a);

    }
    
     
    else if(c==2)
    {
        int b=1;
            for(int i=1;i<=n;i++)
            {b=b*i;}
        System.out.println(b);

    }
    
    
    else
        System.out.println(-1);

    

}
}
