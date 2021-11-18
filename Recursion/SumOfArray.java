
public class Solution{
    public static int sum(int input[]) {
		  
        
       // int sum1=input[0];
        int[] smallInput= new int[input.length - 1];
        
        
         if(smallInput.length==0)
            return input[0];
        
        
        for(int i = 1; i<input.length; i++)
			smallInput[i - 1] = input[i];
       
        
        
    
           return input[0]+sum(smallInput);
       
	}
}
