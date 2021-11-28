
public class Solution {

	public static String replaceCharacter(String str, char c1, char c2) {
		
        if(str.length() == 0){
			return str;
		}
		String ans = "";
		
        if(str.charAt(0) != c1)
			ans = ans + str.charAt(0);	
        
		else if(str.charAt(0)==c1)
            ans=ans+c2;
        
        
		String smallAns = replaceCharacter(str.substring(1),c1,c2);
		return ans + smallAns;
	}
}
