import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    char c=s.next().charAt(0);
        double k=((59.0/100)*i+1700+i);
    double l=((59.0/100)*i +1500+i);
        double m=((59.0/100)*i +1300+i);
        if(c=='A')
            System.out.println(Math.round(k));
            else if(c=='B')
                System.out.println(Math.round(l));
                else 
                    System.out.println(Math.round(m));

	}
}
