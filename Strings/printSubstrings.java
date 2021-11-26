
public class Solution {

	public static void printSubstrings(String str) {
	 String substr="";
        
        for(int i=0;i<=str.length()-1;i++)
        System.out.println(str.charAt(i));
        
        for(int i=0;i<=str.length()-1;i++)
        {
            substr="";
             substr+=str.charAt(i);
            for(int j=i+1;j<=str.length()-1;j++)
            {
               substr+=str.charAt(j);
                System.out.println(substr);
            }

        }
        

	}

}
