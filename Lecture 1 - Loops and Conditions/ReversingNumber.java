import java.util.Scanner;
public class Main {

    public static int power(int n,int x){
        int a=n;
        int j=1;
       
        {while(j<=x-1)
        {
           a=a*n;
           j=j+1;
        }
    }
         if (n!=0 && x!=0)
        return a;
        
        else
            return 1;
    }
     
  
      

     
    public static void main(String[] args) {    
    Scanner s = new Scanner(System.in);
	int n = s.nextInt();
      
 

        
           
    int count=0;
    for(int i=n;i>0;i=i/10)
    {
        count= count+1;
    }
    int m=count;



     int b=0;
     int a=0;
    for(int i=n;i>0;i=i/10)
    {
    a=i%10;
    b=b+a*(power(10,m-1));
        m--;
    }

       System.out.println(b);

       
	}
}
