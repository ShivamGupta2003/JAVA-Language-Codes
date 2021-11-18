public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		
        if(input.length<=0)
            return false;
        
        if(input[0]==x)
            return true;
        
	 int[] smallInput= new int[input.length - 1];
        
        for(int i = 1; i<input.length; i++)
			smallInput[i - 1] = input[i];
       
        
          boolean b=checkNumber(smallInput,x);
          System.out.println(b);

        
        return false;
	}
}
