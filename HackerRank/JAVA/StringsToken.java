import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if(s.length()>0 && s.length()<=400000 ){
            String [] s2=s.split("[!,?._'@\\s]+");
            System.out.println(s2.length);
            for (String word:s2)
            System.out.println(word);
        }
        
        
        scan.close();
    }
}

