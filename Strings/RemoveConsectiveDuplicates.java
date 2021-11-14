
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		
         String returned="";
        returned+=str.charAt(0);
        for(int i=0;i<str.length()-1;i++)
           {
            if(str.charAt(i)!=str.charAt(i+1))
            {returned+=str.charAt(i+1);}
            }
            
            
            return returned;
	}
}
