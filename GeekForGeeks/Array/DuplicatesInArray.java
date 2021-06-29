//elements are from 0 to n-1 --> elements are positive

//this code does not have follow if 0 as an array element

// import java.util.*;
// public class DuplicatesInArray {
//     public static void main(String[] args) {
    

//         int arr[] = { 1, 2, 3, 1, 3, 6, 6 };

//         int i=0;

//         System.out.println("The repeating elements are: ");

//         for(i=0;i<arr.length;i++){
//             int j=Math.abs(arr[i]);
//             if(arr[j]>=0){
//                 arr[j]=-arr[j];
//             }
//             else{
//                 System.out.print(j+" ");
//             }
//         }


//     }
// }

//Using extra space but O(n) time  but to check the number of frequency in array

import java.util.*;
public class DuplicatesInArray{
    public static void main(String[] args){
        int arr[]=new int[]{2,2,3,3,5,6,7,9,9,0};

        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],1);
            }
            else{
                h.put(arr[i], h.get(arr[i])+1);
            }
        }
            //if(h.getKey()>1){
            for(int j=0;j<arr.length;j++){
                if(h.get(arr[j])>1){
                    System.out.println(arr[j]);
                }
            }

            // for (Map.Entry<Integer, Integer> x : h.entrySet())
            // if (x.getValue() > 1)
            //     System.out.print(x.getKey() + " ");

        }
}