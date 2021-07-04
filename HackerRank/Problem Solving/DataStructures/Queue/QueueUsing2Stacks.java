import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        MyQueue queue = new MyQueue();
        
        Scanner sc=new Scanner(System.in);
        
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int type=sc.nextInt();
            if(type==1){
                int x=sc.nextInt();
                queue.enqueue(x);
            }else if(type==2){
                queue.dequeue();
            }else if(type==3){
                System.out.println(queue.peek());
            }
        }
    sc.close();
    }
}

class MyQueue{
    
    Stack<Integer> input=new Stack();
    Stack<Integer> output=new Stack();
    
    void enqueue(int x){
        input.push(x);
    }
    
    int dequeue(){
        peek();
        return output.pop();
    }
    
    int peek(){
        if(output.empty()){
            while(!input.empty()){
            output.push(input.pop());
            }
        }
        return output.peek();
    }
        
}