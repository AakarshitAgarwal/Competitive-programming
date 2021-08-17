public static void levelOrder(Node node) {
    // write your code here
    Queue<Node> mq=new ArrayDeque<>();
    mq.add(node);
    
    while(mq.size()>0){
        int count=mq.size();   //number of elements in current level
        for(int i=0;i<count;i++)   //RPA child
        {
            node=mq.remove();
            System.out.print(node.data+" ");
            
            if(node.left!=null)  //adding left child
            {
                mq.add(node.left);
            }
            if(node.right!=null)  //adding right child
            {
                mq.add(node.right);
            }
        }
        System.out.println();
    }
    
    
  }