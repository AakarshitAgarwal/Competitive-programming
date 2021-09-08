//import java.io.*;
import java.util.*;

public class Floodfill{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        // scn.close();
        boolean[][] visited=new boolean[n][m];  //default false
        floodfillBackTrack(arr,0,0,"",visited);
    }
    
    // asf -> answer so far
    public static void floodfillBackTrack(int[][] maze, int row, int col, String psf,boolean[][] visited ) {
        if(row<0 || col<0 || row==maze.length || col==maze[0].length || maze[row][col]==1 || visited[row][col]==true){
            return;
        }
        
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(psf);
            return;
        }

        visited[row][col]=true;

        floodfillBackTrack(maze,row-1,col,psf+"t",visited);
        floodfillBackTrack(maze,row,col-1,psf+"l",visited);
        floodfillBackTrack(maze,row+1,col,psf+"d",visited);
        floodfillBackTrack(maze,row,col+1,psf+"r",visited);
        
        visited[row][col]=false;
    }
}
