import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    LinkedList<String> l1=new LinkedList<>();
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        
    for(int i=0;i<n;i++){
        l1.add(sc.next());
    }
    
    for(String s:l1){
    System.out.println(s);
    }
    
    }
}
