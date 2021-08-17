import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        
    int arr[]=new int[]{7,8,10,11,12,13};

    for(int i=arr[0],j=0;i<=arr.length;i++,j++){
        if(arr[j]!=i){
            System.out.println("Missing number is "+i);
            break;
            }
        }
    }
}


//or use the formula sum of n elements n(n+1)/2

//Code not working for int arr[]=new int[]{7,8,10,11,12,13};
