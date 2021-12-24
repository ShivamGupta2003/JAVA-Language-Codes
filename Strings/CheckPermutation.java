// QUESTION

// FUNCTIONAL CODE
public class Solution {

	public static boolean isPermutation(String str1, String str2) {
        
        if(str1.length()!=str2.length())
            return false;
        
        int fre[] = new int[256];
   
        
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            ++fre[ch];
        }
        
        
        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            --fre[ch];
        }
        
        for(int i=0;i<256;i++){
            if(fre[i]!=0){
                return false;
            }
        }

//MAIN CODE
