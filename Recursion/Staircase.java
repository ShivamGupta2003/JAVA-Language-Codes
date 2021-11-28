public class Solution {	
     public static int staircase(int n){
	
         if(n==0)
             return 1;
         
         else if(n<0)
             return 0;
         
         
         int sa1=staircase(n-1);
             
         int sa2=staircase(n-2);
            
         int sa3=staircase(n-3);
             return sa3+sa2+sa1;
      
	}
}
