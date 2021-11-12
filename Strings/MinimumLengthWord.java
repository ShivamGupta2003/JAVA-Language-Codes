public class solution {
	public static void print2DArray(int input[][]) {
		int a=0;
        int rows=input.length;
            
            if (rows==0)
            return;
       
        int columns=input[0].length;
        
        for(int i=0;i<rows;i++)
        {
            
            while(a<rows-i){
               
                for(int j=0;j<columns;j++)
            {System.out.print(input[i][j]+" ");}
                
            a++;
            System.out.println();
            }
        
            a=0;
        }
        
        

	}
}
