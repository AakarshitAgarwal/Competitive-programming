//import java.io.*;
import java.util.*;

//import org.graalvm.compiler.asm.aarch64.AArch64Assembler.SystemRegister;

public class Constructor {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    public static class Pair{
        Node node;
        int state;

        Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }

    public static void display(Node node){
        if(node==null){
            return;
        }

        String str = "";
        str += node.left == null? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null? ".": node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);        
    }
    public static void main(String[] args) throws Exception{
        Integer[] arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root =new Node(arr[0], null, null);  // first root element will be 50 ofcourse
        Pair rtp=new Pair(root,1);    //initialing root element

        Stack<Pair> st=new Stack<>();
        st.push(rtp);

        int idx=0;
        while(st.size()>0)   //run till stack is not empty
        {
            Pair top=st.peek();
            if(top.state == 1){
                idx++;
                if(arr[idx] != null){
                    top.node.left=new Node(arr[idx], null, null);   //made a node with new index to be inserted left
                    Pair lp=new Pair(top.node.left,1);            //new pair is added
                    st.push(lp);                                  //inserted that left pair into stack
                }else{
                    top.node.left=null;               //is null is to inserted on left
                }
                top.state++;
            }else if(top.state==2){
                if(arr[idx] != null){
                    top.node.right=new Node(arr[idx],null,null);   //made a node with new index to be inserted left
                    Pair rp=new Pair(top.node.right,1);            //new pair is added
                    st.push(rp);                                  //inserted that right pair into stack
                }else{
                    top.node.right=null;               //is null is to inserted on right
                }
                top.state++;
            }else{
                st.pop();
            }
        }

        display(root);
        // return root;

    }
}
