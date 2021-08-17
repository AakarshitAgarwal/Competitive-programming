public static int diameter1(Node node) {
    // write your code here
    
    if(node==null){
        return 0;
    }
    
    //max distance between 2 nodes from left hand side
    int ld = diameter1(node.left);
    //max distance between 2 nodes from right hand side
    int rd = diameter1(node.right);
    //max  distance between left's deepest and right's deepest
    int f = height(node.left)+height(node.right)+2;
    
    int dia =Math.max(f,Math.max(ld,rd));
    return dia;
    
  }
