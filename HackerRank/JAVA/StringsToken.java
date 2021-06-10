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

// All test case pass solution

/*

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Write your code here.
        
        if(!scan.hasNext()){
            System.out.println("0");
            return;
        }
        
        String s = scan.nextLine();
        scan.close();
        
                String [] s2=s.trim().split("[!,?._'@\\s]+");
                System.out.println(s2.length);
            for (int i=0;i<s2.length;i++){
                System.out.println(s2[i]);
            }
        
        
        scan.close();
    }
}



*/