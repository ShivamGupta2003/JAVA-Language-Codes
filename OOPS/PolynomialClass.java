/*Implement a polynomial class, that contains following functions -
1. setCoefficient -
This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
2. add -
Adds two polynomials and returns a new polynomial which has the result.
3. subtract -
Subtracts two polynomials and returns a new polynomial which has the result.
4. multiply -
Multiplies two polynomials and returns a new polynomial which has the result.
5. print -
Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
Print pattern for a single term : "x"
And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
Note : Only keep those terms which have non - zero coefficients.*/




public class Polynomial {

	// public int coeff;
	// public int degree;
    public int arr[];
    
    Polynomial(){
    arr=new int[1];}
	
    
    
public void setCoefficient(int degree, int coeff){
    if(degree>=arr.length)
    {int temp[]=arr;
     arr=new int[degree+1];
    for(int i=0;i<temp.length;i++)
    {arr[i]=temp[i];}
	}
    arr[degree]=coeff;
}
	
public int getCoefficient(int degree){
    if(degree<this.arr.length)
    {return arr[degree];}
    else
    {return 0;}
}
    
public void print(){
		for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            System.out.print(arr[i]+"x"+i+" ");
        }
	}

	
public Polynomial add(Polynomial p){
    Polynomial ans=new Polynomial();
    int degree1=this.arr.length-1;
    int degree2=p.arr.length-1;
    int mindegree=Math.min(degree1,degree2);
    int i=0;
        for(i=0;i<=mindegree;i++)
        {ans.setCoefficient(i,this.arr[i]+p.arr[i]);}
    
        while(i<=degree1)
            {ans.setCoefficient(i,this.arr[i]);
                i++;}
    
        while(i<=degree2)
            {ans.setCoefficient(i,p.arr[i]);
                i++;}
    
		return ans;
	}
	
    
public Polynomial subtract(Polynomial p){
		 Polynomial ans=new Polynomial();
    int degree1=this.arr.length-1;
    int degree2=p.arr.length-1;
    int mindegree=Math.min(degree1,degree2);
    int i=0;
        for(i=0;i<=mindegree;i++)
        {ans.setCoefficient(i,this.arr[i]-p.arr[i]);}
    
        while(i<=degree1)
            {ans.setCoefficient(i,this.arr[i]);
                i++;}
    
        while(i<=degree2)
            {ans.setCoefficient(i,p.arr[i]);
                i++;}
    
		return ans;
	}
	
public Polynomial multiply(Polynomial p){
	 Polynomial ans=new Polynomial();
    int degree1=this.arr.length-1;
    int degree2=p.arr.length-1;
    for(int i=0;i<=degree1;i++){
        for(int j=0;j<=degree2;j++){
            int termdeg=i+j;
            int termcof=this.arr[i]*p.arr[j];
            int oldcof=ans.getCoefficient(termdeg);
     ans.setCoefficient(termdeg,termcof+oldcof);
        }
    }
    
		return ans;
	}
}
