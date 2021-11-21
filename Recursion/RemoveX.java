
public class solution {

	// Return the changed string
	public static String removeX(String input){
		
        if(input.length()==0)
            return "";
        
        String smallAns=input.substring(1);
        
        if(input.charAt(0)=='x')
            return removeX(smallAns);
        
        else
            return input.charAt(0)+removeX(smallAns);
        
        
	}
}
