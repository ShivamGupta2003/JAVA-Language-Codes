public class solution {

     public static int binarySearch(int input[], int element) {
       return binarySearch(input,element,0,input.length-1);
	}
    
    public static int binarySearch(int input[],int element,int si,int ei){
        if(si>ei)
            return -1;
        
        int mi=(si+ei)/2;
        int smallAns=0;
  
    if(input[mi]==element)
        return mi;
    
    if(input[mi]>element)
    smallAns= binarySearch(input,element,si,mi-1);
    
    else if(input[mi]<element)
    smallAns= binarySearch(input,element,mi+1,ei);
    
    return smallAns;}
    
}
