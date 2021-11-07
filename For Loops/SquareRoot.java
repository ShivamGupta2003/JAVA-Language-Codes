import java.util.Scanner;
public class Main {

    
    
    //power function
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
      
           if(n!=0){
        int b=0;
               int i=0;
    for(i=b;(power(i,2))<=n;i=i+1)
    {}
          System.out.println(i-1);
           }
        
        
        else
            System.out.println(0);

      }   
	}

