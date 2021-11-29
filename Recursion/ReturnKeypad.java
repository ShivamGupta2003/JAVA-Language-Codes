//fn code
public class solution {

	public static String helper(int n)
    {
    if(n==2)
        return "abc";
        
    if(n==3)
        return "def";
      
    if(n==4)
        return "ghi";
          
    if(n==5)
        return "jkl";
              
    if(n==6)
        return "mno";
        
    if(n==7)
        return "pqrs";
            
    if(n==8)
        return "tuv";
                
    if(n==9)
        return "wxyz";
        
        else
            return "";
    }              
    
    
	public static String[] keypad(int n){
		
        if(n==0){
            String ans[]={""};
            return ans;}
       
       int i=0;  
       int k=0;
       String smallAns[]=keypad(n/10);
       String helped=helper(n%10);
       String ans[]=new String[smallAns.length*helped.length()];
        
    
      
             
         
       
           if(helped.length()==3){
                for(int a=0;a<smallAns.length;a++)
                {ans[i]=smallAns[a]+helped.charAt(0);
                 i++;}
               
                for(int a=0;a<smallAns.length;a++)
                {ans[i]=smallAns[a]+helped.charAt(1);
                 i++;}
               
                for(int a=0;a<smallAns.length;a++)
                {ans[i]=smallAns[a]+helped.charAt(2);
                i++;}
           }
           
            if(helped.length()==4){
                for(int a=0;a<smallAns.length;a++)
                {ans[i]=smallAns[a]+helped.charAt(0);
                 i++;}
               
                for(int a=0;a<smallAns.length;a++)
                {ans[i]=smallAns[a]+helped.charAt(1);
                 i++;}
               
                for(int a=0;a<smallAns.length;a++)
                {ans[i]=smallAns[a]+helped.charAt(2);
                i++;}
            
                
             for(int a=0;a<smallAns.length;a++){
               ans[i]=smallAns[a]+helped.charAt(3);
             i++;}
            }
       
        
        return ans;

	}
	
}

//main code
import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = solution.keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
