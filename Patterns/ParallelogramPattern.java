import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt(); 
   
   
        
        for(int i=1;i<=n;i++)
    {       
    
        for(int j=1;j<=i-1;j++)
           System.out.print(" ");
            
        for(int m=1;m<=n;m++)
           System.out.print('*');
                        
        
    	
         
        
           System.out.println();
        }           
 
   
    
    
    
    
    }  
    }
