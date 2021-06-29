// Expected time complexity is O(n) and extra space is O(1). 
import java.util.*;

public class first3largestelements {
    public static void main(String args[]){
        int arr[]=new int[]{10, 4, 3, 50, 23, 90};

        int first=0,second=0,third=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }
    
}
