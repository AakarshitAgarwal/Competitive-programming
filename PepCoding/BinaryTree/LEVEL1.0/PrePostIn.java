public static void iterativePrePostInTraversal(Node node) {
    // write your code here
    if(node==null){
        return;
    }
    
    System.out.print(node.data+" ");
    iterativePrePostInTraversal(node.left);
    System.out.print(node.data+" ");
    iterativePrePostInTraversal(node.right);
    System.out.print(node.data+" ");
  }