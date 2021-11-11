import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        if(n!=0)
        {int i=n;
        int count=0;
        while(i>0)
        {  
           i=i/2; 
           count++;
        }
        
        
        int shivam[]=new int[count];
            int j=count-1;
        i=n;
        while(i>0)
        {
           int a=i%2;
           shivam[j]=a;
           i=i/2;  
        j--;
        }
        
        for(int m=0;m<count;m++)
            System.out.print(shivam[m]);}
        
        
        else
            System.out.println('0');



	}
}
