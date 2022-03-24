// You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
// Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
// Input Format
// Line 1: Integer N
// Next N Lines: Each line will contain ith row elements (separated by space)
// Output Format :
// The output line contains true if any path exists for the rat to reach its destination otherwise print false.
// Sample Input 1 :
// 3
// 1 0 1
// 1 0 1
// 1 1 1
// Sample Output 1 :
// true
// Sample Input 2 :
// 3
// 1 0 1
// 1 0 1
// 0 1 1
// Sample Output 2 :
//  false



public class Solution {

	public static boolean ratInAMaze(int maze[][]){
        
	   int path[][]=new int[maze.length][maze.length];
        return ratInAMaze(maze,path,0,0,maze.length-1);

	}
    
    public static boolean ratInAMaze(int maze[][],int path[][],int i,int j,int n){
        
        if (i<0 || j<0 || i>n|| j>n)
			return false;
        
        if (path[i][j]==1)
			return false;
        
        if (maze[i][j]==0)
			return false;
        
        path[i][j]=1;
        
        if(i==n && j==n)
            return true;
        
        
        if(ratInAMaze(maze,path,i-1,j,n) || ratInAMaze(maze,path,i+1,j,n) || ratInAMaze(maze,path,i,j+1,n) || ratInAMaze(maze,path,i,j-1,n) )
            return true;
        
        return false;
        
        
	}
    
    
    
}



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		System.out.println(Solution.ratInAMaze(maze));	
	}

}
