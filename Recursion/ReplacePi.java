public class solution {

	public static String replace(String input){
        
        if(input.length()<=1)
            return input;
        
        String smallAns=input.substring(1);
        
        if(input.charAt(0)=='p' && input.charAt(1)=='i')
            return "3.14"+replace(input.substring(2));
        
        else
            return input.charAt(0)+replace(input.substring(1));
        
        
	}
}


	

