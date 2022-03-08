public class LCS_03_DP {

public static int lcsdp(String s,String t){
    int m=s.length();
    int n=t.length();
    int storage[][]=new int[s.length()+1][t.length()+1];

    for(int i=0;i<=m;i++){
        storage[i][0]=0;   
    }

    for(int j=0;j<=n;j++){
        storage[0][j]=0; 
    }

    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            
            if(s.charAt(m-i)==t.charAt(n-j))
            {
                storage[i][j]=1+storage[i-1][j-1];
            }

            else
            {
                storage[i][j]=Math.max(storage[i-1][j],storage[i][j-1]);
            }
        }
    }

    return storage[m][n];
}


    public static void main(String[] args) {
        String d="adgei";
        String p="abegi";
        System.out.println(lcsdp(d,p));
    
    }
    
    }
    

