import java.util.*;

public class FirstRepeatingElement {
    public static void main(String args[]){

        int min=-1;

        int arr[]=new int[]{10, 5, 3, 4, 5,3, 6};

        HashSet<Integer> set=new HashSet<>();

        for(int i=arr.length-1;i>=0;i--){
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
            System.out.println(set);
        }    
}
