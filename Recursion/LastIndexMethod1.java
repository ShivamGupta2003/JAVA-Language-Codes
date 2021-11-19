
public class Solution {

	public static int lastIndex(int input[], int x) {
        return lastIndex(input,x,input.length-1);
	}
    
    
    public static int lastIndex(int input[], int x,int endIndex) {
	
        if(endIndex<0)
		return -1;
        
        if(input[endIndex]==x)
            return endIndex;
        
        int smallAns=lastIndex(input,x,endIndex-1);
            return smallAns;
        
        
	}
	
}
