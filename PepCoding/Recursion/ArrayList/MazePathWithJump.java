import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    ArrayList<String> res=getMazePaths(1,1,n,m);
    System.out.println(res);
    }

    
    
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // return null;
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> paths=new ArrayList<>();
        
        //horizontal moves
        
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> hpaths=getMazePaths(sr,sc+ms,dr,dc);
            for(String hpath:hpaths){
                paths.add("h"+ms+hpath);
            }
        }
        
        
        //vertical moves
        
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vpaths=getMazePaths(sr+ms,sc,dr,dc);
            for(String vpath:vpaths){
                paths.add("v"+ms+vpath);
            }
        }
        
        //diagonal moves

        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            ArrayList<String> dpaths=getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String dpath:dpaths){
                paths.add("d"+ms+dpath);
            }
        }
        
        return paths;
        
    }

}