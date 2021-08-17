public static void printKNodesFar(Node node, int data, int k) { 
    // write your code here
    path = new ArrayList<>();    //true or false + nodes bhar ke deta h
    find(node,data);    
    for(int i=0;i<path.size();i++){
        printKLevelsDown(path.get(i),k-i,i==0 ? null: path.get(i-1));
    }
    
  }
    
    static ArrayList<Node> path;
    public static boolean find(Node node, int data){  //this run half euler
    // write your code here
    if(node==null){
        return false;
    }
    
    if(node.data==data){   //if root is a number which we have to found
        path.add(node);
        return true;
    }
    
    boolean filc =find(node.left,data);   //find in left child
    if(filc){
        path.add(node);
        return true;
    }
    
    boolean firc =find(node.right,data);
    if(firc){
        path.add(node);
        return true;
    }
    
    return false;  //when it is found never
    }
    
    // if(node==null || k<0){
    //     return;
    //}
    
    public static void printKLevelsDown(Node node, int k,Node blocker){
    // write your code here
        if(node==null || k < 0 || node==blocker){
            return;
        }
        if(k==0){
            System.out.println(node.data);
        }
        printKLevelsDown(node.left,k-1,blocker);
        printKLevelsDown(node.right,k-1,blocker);
    }
  