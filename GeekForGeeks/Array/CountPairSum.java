public class CountPairSum {
    public static void main(String[] args){
        int arr[]=new int[]{1, 5, 7, -1};
        int sum=6;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((arr[i]+arr[j])==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
