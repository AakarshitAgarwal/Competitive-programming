import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int s,q,x,y;
        ArrayList[] set =new ArrayList[n];
        //getting no. of arraylist and entering values according to the list
        for(int i=0;i<n;i++){
            s=in.nextInt();
            set[i] = new ArrayList();
            for(int j=0;j<s;j++){
                set[i].add(in.nextInt());
            }
        }
        q=in.nextInt();
        for(int k=0;k<q;k++){
            x=in.nextInt();
            y=in.nextInt();
            try{
                System.out.println(set[x-1].get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        
    }
}
public class javaArrayList {
    
}
