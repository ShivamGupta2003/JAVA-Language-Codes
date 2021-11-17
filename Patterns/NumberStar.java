import java.util.Scanner;
public class runner {

	public static void main(String[] args) {
		// Write your code here
      Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        
        if(j==n-i+1)
        { System.out.print('*');}
        
        else
        {System.out.print(n-j+1);}
        }
System.out.println();
}

	}
}
