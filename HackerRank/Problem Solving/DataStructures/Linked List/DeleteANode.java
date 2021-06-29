import java.io.*;
import java.util.*;

public class LinkedListDemo {
    public static void main(String args[])
    {

        // Creating an empty LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // Use add() method to add elements in the list
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        
        int position=sc.nextInt();
        // Remove the head using remove()
        list.remove(position);

        // Print the final list
        for(String s:list){
         System.out.print(s+" ");   
        }
    }
}
