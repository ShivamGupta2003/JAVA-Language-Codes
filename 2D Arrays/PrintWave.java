
public class Solution {

	public static void wavePrint(int mat[][]){
		int rows=mat.length;
        if(rows==0)
            return;
        
        int cols=mat[0].length;
        int i=0;
        int j=0;
        int rs=0;
        int rbs=rows-1;
        
        while(j<cols)
        {
         
               
           for(i=rs;i<rows;i++)
           {if(i==rows-1 && j==cols-1)
          {
              System.out.println(mat[i][j]);
              break;
          }
               System.out.print(mat[i][j]+" ");}

            j++;
                
            for(i=rbs;i>=0;i--)
            { if(i==rows-1 && j==cols-1)
          {
              System.out.println(mat[i][j]);
              break;
          }
                System.out.print(mat[i][j]+" ");}
             
            j++;
        }
	}

}
