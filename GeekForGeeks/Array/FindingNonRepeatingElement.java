import java.util.*;

    
public class FindingNonRepeatingElement {
    public static void main(String[] args) {
    int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;

        Map<Integer,Integer> m =new HashMap<>();
        for(int i=0;i<n;i++){
            if(m.containsKey(arr[i])){
                m.put(arr[i],m.get(arr[i]+1));
            }
            else{
                m.put(arr[i],1);
            }
        }


        for(int j=0; j<n; j++){
            if(m.get(arr[j]) == 1){
                System.out.println(arr[j]);
                break;
            }
        }
        

        
    }
}

//What is this logic

// static int firstNonRepeating(int arr[], int n)
// {
//     for (int i = 0; i < n; i++) {
//         int j;
//         for (j = 0; j < n; j++)
//             if (i != j && arr[i] == arr[j])
//                 break;
//         if (j == n)
//             return arr[i];
//     }

//     return -1;
// }

