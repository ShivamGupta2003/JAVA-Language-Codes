import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
          Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][]=new int[V][V];
        for(int i=0;i<E;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        int V1=s.nextInt();
        int V2=s.nextInt();
        boolean visited[]=new boolean[V];
        boolean ans=hasPath(edges,V1,V2,visited);
        System.out.println(ans);
    }

    public static boolean hasPath(int[][] edges,int V1, int V2,boolean visited[]){
       
        if(V1<edges.length && V2<edges[0].length)
        {
            if(edges[V1][V2]==1)
            return true;
        }
        
        Queue<Integer> q=new LinkedList<>();
        q.add(V1);
       
        if(V1<visited.length)
        visited[V1]=true;
        
        while(!q.isEmpty()){
            int n=q.remove();
            for(int i=0;i<edges.length;i++)
            {
             if(edges[n][i]==1 && !visited[i])
             {
                 q.add(i);
                 visited[i]=true;
             }
            }
        }
        
        
         if(V2<visited.length)
         {
             
         if(visited[V2]==true)
            return true;
             
         }
        
        
            return false;
    }
}
