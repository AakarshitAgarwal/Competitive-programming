import java.util.*;

public class QuickSort {

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
    }

    static int parrtition(int[] arr,int low,int high){

        int pivot=arr[low];
        int i=low;
        int j=high;
        
        do{

        do{
            i++;
        }while(arr[i]<=pivot);

        do{
            j--;
        }while(arr[j]>=pivot);

        if(i<j)
        swap(arr, i, j);
        }while(i<j);

        swap(arr, low, j);
        return j;
    }

    static void Sort(int[] arr,int low,int high){
        int j;
        if(low<high){
            j=parrtition(arr, low, high);
            Sort(arr, low, j);
            Sort(arr, j+1, high);
        }
    }

    public static void main(String args[]){
        int arr[]=new int[]{50, 23, 9, 18, 61, 32};
        
        int l=arr.length-1;

        QuickSort qs=new QuickSort();

        qs.Sort(arr, arr[0], l);

        for(int m=0;m<=l;m++){
            System.out.print(" "+arr[m]);
        }
    }
}    

