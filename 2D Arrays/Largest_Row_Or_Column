
public class Solution {

	public static void findLargest(int mat[][]){
		
        int max=Integer.MIN_VALUE;
         int max1=Integer.MIN_VALUE;
        int rows=mat.length;
        int index=0;
        int index1=0;
        int rowsum=0;
        int colmsum=0;
        
        if(rows==0)
        {
            System.out.println("row 0 -2147483648");
                return;
        }
        
        int colms=mat[0].length;
        
        for(int i=0;i<rows;i++)
        {rowsum=0;
        for(int j=0;j<colms;j++)
        {rowsum=rowsum+mat[i][j];}
         if(rowsum>max)
         {max=rowsum;
          index=i;}
	     }

        
          for(int i=0;i<colms;i++)
        {
              colmsum=0;
        for(int j=0;j<rows;j++)
        {colmsum+=mat[j][i];}
         if(colmsum>max1)
         {max1=colmsum;
          index1=i;}
	    }
        
      //  System.out.println(max1);

        
if(max>=max1)
    System.out.println("row"+" "+index+" "+max);

else if(max<max1)
            System.out.println("column"+" "+index1+" "+max1);

        
}
}
