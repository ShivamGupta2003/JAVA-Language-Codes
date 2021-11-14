
public class ComplexNumbers {
	public int real;
    public int imaginary;
    
    
    public ComplexNumbers(int real,int imaginary){
    this.real=real;
    this.imaginary=imaginary;
    }
   
    
    
    public void plus(ComplexNumbers c2)
    {this.real=this.real+c2.real;
     this.imaginary=this.imaginary+c2.imaginary;
     }
    
    public void multiply(ComplexNumbers c2)
    { int real1=this.real;
        this.real=(this.real*c2.real)-(this.imaginary*c2.imaginary);
     this.imaginary=(real1*c2.imaginary)+(this.imaginary*c2.real);
     }
    
public void print() {
    

		System.out.println(real +" "+ '+'+" " +'i' +imaginary);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
