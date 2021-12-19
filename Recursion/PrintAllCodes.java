// QUESTION

/*
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. And input string does not contain 0s.
Input format :
A numeric string
*/

  
  
//  FUNCTIONAL CODE
  public class solution {
    
	public static char getChar(int n)
    {
        return (char)(96+n);
    }
    
    
	public static  String[] getCode(String input){
		   
        if(input.length()==0)
        {
            String ans[]={""};
            return ans;
        }
       
       int fdig=(input.charAt(0)-'0');
       String sa1[]=getCode(input.substring(1));
       char fchar=getChar(fdig);
       
       String sa2[]=new String[0];
       char f2char=(char)(0); 
       int f2dig=0;
       
        if(input.length()>=2)
        {
            f2dig=((input.charAt(0)-'0')*10)+(input.charAt(1)-'0');
      
            
             if(f2dig>=10 && f2dig<=26)
             {
                 f2char=getChar(f2dig);
                    sa2=getCode(input.substring(2));
             }
        }
     
        String ans[]=new String[sa1.length+sa2.length];
            
            int k=0;
        
        for(int i=0;i<sa1.length;i++,k++)
        ans[k]=fchar+sa1[i];
        
        for(int i=0;i<sa2.length;i++,k++)
        ans[k]=f2char+sa2[i];
            
        return ans;    
	}

	  	public static void printAllPossibleCodes(String input) {
		String output[] = getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
}

// MAIN CODE
import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = solution.getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}

