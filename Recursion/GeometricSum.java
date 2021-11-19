
public class solution {
		
        public static double power(double n,double x){
        double a=n;
        double j=1;
        if (n!=0)
        {while(j<=x-1)
        {
           a=a*n;
           j=j+1;
        }
    }
        return a;
    }
     
        
        public static double findGeometricSum(int k){
        
            if(k==0)
                return 1;
            
            double m=findGeometricSum(k-1);
            return 1/(power(2,k))+m;
        
        
        
	}
}
