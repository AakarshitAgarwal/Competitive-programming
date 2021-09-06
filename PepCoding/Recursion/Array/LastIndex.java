import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int fi=lastIndex(arr,0,d);
        System.out.println(fi);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        // return 0;
        if(idx==arr.length){
            return -1;
        }
        
        int liisa=lastIndex(arr,idx+1,x);
        if(liisa==-1){
            if(arr[idx]==x){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return liisa;
        }
        
    }

}