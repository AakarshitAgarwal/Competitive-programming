import java.util.*;

public class FirstRepeatingElement {
    public static void main(String args[]){

        int min=-1;

        int arr[]=new int[]{10, 5, 3, 4, 3, 5, 6};

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                min=i;
            }
            else{
                set.add(arr[i]);
            }
        }
            if(min!=-1){
                System.out.println("First Repeating element is "+arr[min]);
            }
            else{
                System.out.println("There is no repeating element");
            }
    }    
}
