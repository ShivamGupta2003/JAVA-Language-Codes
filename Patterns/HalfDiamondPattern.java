import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(); 
   
   
if(n==0)
{System.out.println('*');
         System.out.println('*');}

        else{
        for(int i=1;i<=n+1;i++)
        {    
        
            System.out.print('*');

            
            for(int j=1;j<=i-1;j++)
            System.out.print(j);
           
            for(int j=i-2;j>=1;j--)
            System.out.print(j);
           
              if(i!=1)
            System.out.print('*');

          
          System.out.println();
            
        }
        
        
        for(int i=1;i<=n;i++)
        {    
        
            System.out.print('*');

            
            for(int j=1;j<=n-i;j++)
            System.out.print(j);
           
            for(int j=n-i-1;j>=1;j--)
            System.out.print(j);
           
              if(i!=n)
            System.out.print('*');

          
          System.out.println();
            
        }
        }

        }           
   
    }  
    
