package QuickSortRevision;
import java.util.*;
class QuickSortMiddle{
    public static void main(String args[]){
        int[] arr={15,9,7,13,12,16,4,18,11};

        int len=arr.length;

        QuickSortMiddle qsm=new QuickSortMiddle();
        qsm.QuickSortRecursion(arr,0,len-1);
        qsm.printArray(arr);
    }

    // static void swap(int l,int h){
    //     int  temp;
    //     temp=l;
    //     l=h;
    //     h=temp;
    // }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
    }

    int partition(int[] arr,int low,int high){
        int pivot=arr[(low+high)/2];

        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                swap(arr,low,high);
                low++;
                high--;
            }
        }
        return low;
    }

    void QuickSortRecursion(int[] arr,int low,int high){
        int pi=partition(arr, low, high);
        if(low<pi-1){
            QuickSortRecursion(arr, low,pi-1);
        }
        if(pi<high){
            QuickSortRecursion(arr,pi, high);
        }
    }

    void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }


}