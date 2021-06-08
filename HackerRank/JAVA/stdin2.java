import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string2;    //variable declared
        int i = scan.nextInt();
        double d = scan.nextDouble();
        string2 = scan.nextLine();  //take the entered in the buffer as a input
        string2 = scan.nextLine();  //to take a new input and overwrite the previous one
        

        // Write your code here.

        System.out.println("String: " + string2);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


