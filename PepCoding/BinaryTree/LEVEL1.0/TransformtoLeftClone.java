public static Node createLeftCloneTree(Node node){
    // write your code here
    if(node==null){
        return null;
    }
    
    
    Node lcr=createLeftCloneTree(node.left);
    Node rcr=createLeftCloneTree(node.right);
    
    Node nn=new Node(node.data,lcr,null);  //node or left ke beech ek banda aega jiska rigth null hoga 
    node.left=nn;   //this will stick to left of the node
    node.right=rcr;
    
    return node;
  }