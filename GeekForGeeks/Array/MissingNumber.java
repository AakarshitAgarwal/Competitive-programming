import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        
    int arr[]=new int[]{1,2,3,4,6,7};

    for(int i=arr[0],j=0;i<=arr.length;i++,j++){
        if(arr[j]!=i){
            System.out.println("Missing number is "+i);
            i++;
            }
        }
    }
}


//or use the formula sum of n elements n(n+1)/2