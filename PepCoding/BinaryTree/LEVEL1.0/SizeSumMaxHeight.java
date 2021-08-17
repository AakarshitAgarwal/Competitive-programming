public static int size(Node node) {
    // write your code here
    if(node==null){
        return 0;
    }
    int ls=size(node.left);
    int rs=size(node.right);
    int ts=ls+rs+1;
    return ts;
  }

  public static int sum(Node node) {
    // write your code here
    if(node==null){
        return 0;
    }
    int lsm=sum(node.left);
    int rsm=sum(node.right);
    int tsm=lsm+rsm+node.data;
    return tsm;
    
  }

  public static int max(Node node) {
    // write your code here
    if(node==null){
        return Integer.MIN_VALUE;
    }
    
    int lm=max(node.left);
    int rm=max(node.right);
    int tm=Math.max(node.data,Math.max(lm,rm));
    
    return tm;
  }

  public static int height(Node node) {
    // write your code here
    if(node==null){
        return -1;   //-1 for edges,0 for nodes
    }
    
    int lh=height(node.left);
    int rh=height(node.right);
    int th=Math.max(lh,rh)+1;
    return th;
    
  }