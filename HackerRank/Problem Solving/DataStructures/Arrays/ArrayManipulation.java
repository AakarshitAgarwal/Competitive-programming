// class Result {

//     /*
//      * Complete the 'rotateLeft' function below.
//      *
//      * The function is expected to return an INTEGER_ARRAY.
//      * The function accepts following parameters:
//      *  1. INTEGER d
//      *  2. INTEGER_ARRAY arr
//      */

//     public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//     // Write your code here
//     int size=arr.size();
//     int newarr[]=new int[size];

//     for(int i=0;i<size;i++){
//         if(d>i){
//             newarr[size-d+i]=arr.get(i);
//         }
//         else{
//             newarr[i-d]=arr.get(i);
//         }
//     }
//     // for(int i=0;i<size;i++){
//     //     System.out.print(newarr[i]+" ");
//     // }
//     // List<Integer> list =new ArrayList<Integer>(Arrays.asList(newarr));
//     // List<Integer> list =ArrayList<Integer>(Arrays.asList(newarr));
    
//     // List<Integer> list =new ArrayList<Integer>();
//     // Collections.addAll(list,newarr);
//     // return list;
//     List<Integer> list =new ArrayList<Integer>(size);
//     for(int i:newarr){
//         list.add(i);
//     }
    
//         return list;
    
//     }

// }