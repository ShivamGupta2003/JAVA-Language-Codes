
public class Solution {

	public static void totalSum(int[][] mat) {
		int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int i=0;
        int j=0;
        int n=mat.length;
        
        if(n==0)
        {System.out.println('0');
        return;
    }
        
      
       
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                    a+=mat[i][j];
                
                if(i+j==n-1)
                    b+=mat[i][j];
                
                if(i==0)
                    c+=mat[i][j];
                
                if(j==0)
                    d+=mat[i][j];
                
                if(i==n-1)
                    e+=mat[i][j];
                
                if(j==n-1)
                    f+=mat[i][j];
            }
        }
        int m=0;
        
        if(n%2==0)
        m=a+b+c+d+e+f-(2*mat[0][0])-(2*mat[0][n-1])-(2*mat[n-1][n-1])-(2*mat[n-1][0]);
            
            
       else if(n%2!=0)
       m=a+b+c+d+e+f-(2*mat[0][0])-(2*mat[0][n-1])-(2*mat[n-1][n-1])-(2*mat[n-1][0])-(mat[n/2][n/2]);
        
        
        System.out.println(m);

      
        
        
        
	}

}
