public class LCS_01_Recursion {
    
public static int lcs(String s, String t)
{
    if(s.length()==0 || t.length()==0){
        return 0;
    }
      
    if(s.charAt(0)==t.charAt(0))
    {
        return 1+lcs(s.substring(1), t.substring(1));
    }

    else
    {
        int op1=lcs(s, t.substring(1));
        int op2=lcs(s.substring(1), t);
        int op3=lcs(s.substring(1), t.substring(1));
        return Math.max(op1,Math.max(op2, op3));
    }

    
} 

public static void main(String[] args) {
    String d="adgei";
    String p="abegi";
    System.out.println(lcs(d,p));

}


}
