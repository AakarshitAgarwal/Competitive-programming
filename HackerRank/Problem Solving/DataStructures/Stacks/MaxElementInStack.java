// import java.util.*;

// public class Solution{
//     public static void main(String args[]){
//         Stack<Integer> stack =new Stack<Integer>();
//         Stack<Integer> maxStack =new Stack<Integer>();
        
        
//         Scanner sc=new Scanner(System.in);
//         int N =sc.nextInt();
        
//         for(int i=0;i<N;i++){
//             int query =sc.nextInt();
//             switch(query){
//                 case 1:
//                     int x=sc.nextInt();
//                     stack.push(x);
//                     if(maxStack.isEmpty() || x>=maxStack.peek()){
//                         maxStack.push(x);
//                     }
//                     break;
//                 case 2:
//                     int poppedValue=stack.pop();
//                     if(poppedValue==maxStack.peek()){
//                         maxStack.pop();
//                     }
//                     break;
//                 case 3:
//                     System.out.println(maxStack.peek());
//                     break;
//             }
//         }
//         sc.close();
//     }
// }
