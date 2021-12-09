//  QUESTION
/*Given a string S, find and return all the possible permutations of the input string.
Note 1 : The order of permutations is not important.
Note 2 : If original string contains duplicate characters, permutations will also be duplicates.*/

// FUNCTIONAL CODE
public class solution {
	
  public static int factorial(int n)
  {
      int ans=1;
          
      for(int i=1;i<=n;i++)
              ans=ans*i;
      
      return ans;
  }
    
	public static String[] permutationOfString(String input){
		
        if(input.length()==0)
        {
            String ans[]=new String[1];
            ans[0]="";
            return ans;
        }
        
        String ans[]=new String[factorial(input.length())];
        int k=0;
        
        for(int i=0;i<input.length();i++)
        {
            String recursiveInput=input.substring(0,i)+input.substring(i+1,input.length());
            String smallAns[]=permutationOfString(recursiveInput);
            
            for(int j=0;j<smallAns.length;j++,k++)
            ans[k]=input.charAt(i)+smallAns[j];
                
        }
     
            
        
		return ans;
	}
	
}

// MAIN CODE
import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = solution.permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
