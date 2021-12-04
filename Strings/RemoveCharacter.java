public class Solution {

	public static String removeAllOccurrencesOfChar(String s, char c) {
String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
              str=str+s.charAt(i);  
            }
        }
        return str;
}}
