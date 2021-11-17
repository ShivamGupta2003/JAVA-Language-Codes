import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

	  Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
for(int i=1;i<=n;i++){
    
    
    for(int j=1;j<=n;j++){
        
        if(j==i)
        { System.out.print('*');}
        
        else
        {System.out.print(0);}
        }
    
       System.out.print('*');
    
    
    for(int k=1;k<=n;k++){
        
        if(k==n-i+1)
        { System.out.print('*');}
        
        else
        {System.out.print(0);}
        }
    

System.out.println();
}	
		
	}	


}
