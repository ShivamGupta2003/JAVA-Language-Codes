import java.util.Scanner;
public class Solution {

public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int n=s.nextInt();
        
System.out.println(2);
        

    
for(int i=3;i<=n;i++)
{
          boolean prime=true; 
for(int j=2;j<=i-1;j++) 
{     

        if(i%j==0)
        {
prime= false;
break;
        }
}
    if (prime)
    System.out.println(i); 
}        
}
}
