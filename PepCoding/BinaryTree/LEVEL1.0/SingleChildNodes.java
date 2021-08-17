public static void printSingleChildNodes(Node node, Node parent){
    // write your code here
    if(node==null){
        return;
    }
    
    //check for single child
    if(parent !=null && parent.left==node && parent.right==null){
        System.out.println(node.data);
    }else if(parent !=null && parent.right==node && parent.left==null){
        System.out.println(node.data);
    }
    
    printSingleChildNodes(node.left,node);  //left parent will be node
    printSingleChildNodes(node.right,node);  //same right parent will be node too!
    
  }
