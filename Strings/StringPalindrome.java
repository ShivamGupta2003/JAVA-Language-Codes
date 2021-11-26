
public class Solution {

    public static String reverseString(String str){
        String reversedString="";
        
        for(int i=str.length()-1;i>=0;i--)
        { reversedString+=str.charAt(i); }
    
    return reversedString;}
    
	
    
    
    public static boolean isPalindrome(String str) {
		String reverse=reverseString(str);
     //    System.out.println(reverse);
   
            if(str.equals(reverse))
                return true;
        
        return false;
	}

}
