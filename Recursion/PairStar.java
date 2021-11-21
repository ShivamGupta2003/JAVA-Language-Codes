
public class solution {

	// Return the updated string
	public static String addStars(String input) {
		 
        if(input.length()<=1)
            return input;
        
        String smallAns=input.substring(1);
        
        if(input.charAt(0)==smallAns.charAt(0))
            return input.charAt(0)+"*"+addStars(smallAns);
        
        else
            return input.charAt(0)+addStars(smallAns);
        
        
	}
}
