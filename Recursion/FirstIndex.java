
public class Solution {

	public static int firstIndex(int input[], int x) {
        return firstIndex(input,x,0);
	}
    
    
    public static int firstIndex(int input[], int x,int startIndex) {
	
        if(startIndex >=input.length)
		return -1;
        
        if(input[startIndex]==x)
            return startIndex;
        
        int smallAns=firstIndex(input,x,startIndex+1);
            return smallAns;
        
        
        
	}
	
}
