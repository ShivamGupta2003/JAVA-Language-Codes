
public class Solution {

	public static void spiralPrint(int matrix[][]){
		  int rows=matrix.length;
        
        if(rows==0)
            return;
        
        
        
        int columns=matrix[0].length;
        int a=rows*columns;
        
        
        int k=1;
        int i=0;
        int j=0;
       
       
        
        int cstart=0;
        int cend=columns-1;
        
        int rstart=1;
        int rend=rows-1;
        
        int rbstart=rows-2;
        int rbend=1;
       
        int cbstart=columns-2;
        int cbend=0;
        
 
        
        while(cstart<=cend)
        {    
            
            for(i=cstart;i<=cend;i++)
            {
               System.out.print(matrix[j][i]+" ");

            }
            
            cstart++;
            cend--;
            i--;

            
            for(j=rstart;j<=rend;j++)   
            {
                System.out.print(matrix[j][i]+" ");
            }
            
            rstart++;
            rend--;
            j--;
    
             
             for(i=cbstart;i>=cbend;i--)
             {
               System.out.print(matrix[j][i]+" ");
            }
            
            cbstart--;
            cbend++;
            i++;
            
             
             for(j=rbstart;j>=rbend;j--)
            {
                System.out.print(matrix[j][i]+" ");
            }  
            
            rbstart--;
            rbend++;
            j++;
        }
        
       
       

      
	
    
    
    }
}
