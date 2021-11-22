
public class Solution {

	public static void rowWiseSum(int[][] mat) {
       
	int k=0;
      
        
        int i=0;
        int j=0;
        int rows=mat.length;
        
        if(rows==0)
        {return;}
        
        int columns=mat[0].length;
        
        
        
        
        for(i=0;i<rows;i++)
        {
             k=0;
            for(j=0;j<columns;j++)
            {
               
                k=k+mat[i][j];
            }
            System.out.print(k+" ");
        }
        }
	

}
