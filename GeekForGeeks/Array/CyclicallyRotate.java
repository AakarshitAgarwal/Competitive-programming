import java.util.*;
public class CyclicallyRotate {
public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        int x=arr[arr.length-1];
        for(int i=(arr.length-1);i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;

        // System.out.println(Arrays.toString(arr));
        for(int j=0;j<(arr.length);j++){
            System.out.print(" "+arr[j]);
            }
    }
}
