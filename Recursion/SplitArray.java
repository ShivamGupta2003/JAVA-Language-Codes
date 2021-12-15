
public class solution {

	public static boolean splitArray(int input[]) {
		
        return test(input,0,0,0);
		
	}
	public static boolean test(int input[],int index,int left,int rght)
    {
        if(index==input.length)
        {
            return left==rght;
        }
        if(input[index] %3==0)
        {
            rght+=input[index];
        }
        else if(input[index] %5==0)
        {
            left+=input[index];
        }
        else
        {
            boolean leftSide= test(input,index+1,left+input[index],rght);
            boolean rghtSide= test(input,index+1,left,rght+input[index]);
            return leftSide || rghtSide;
        }
        return test(input,index+1,left,rght);
    }
   
}
