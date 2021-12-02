/*Write a recursive function to convert a given string into the number it represents.
That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.*/

//Functional Code
public class solution {

	public static int convertStringToInt(String input){
		
        if(input.length()==1)
          return input.charAt(0)-48;
        
     
        
        int smallAns=convertStringToInt(input.substring(0,input.length()-1));
            return smallAns*10+(input.charAt(input.length()-1)-48);
	}
}


//RUNNER CODE
import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.convertStringToInt(input));
	}
}
