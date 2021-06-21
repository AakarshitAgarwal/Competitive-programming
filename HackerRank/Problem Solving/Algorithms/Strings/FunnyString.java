    public static String funnyString(String s) {
    // Write your code here
    
    int l=s.length();
    int i=1;
    int j=l-1;
    boolean flag=false;
    // int ASCIIarr[] =new int[l];
    // int ASCIIrevarr[] =new int[l];
    
    while(i<l && j>0){
        int diff=Math.abs((int)s.charAt(i)-s.charAt(i-1));
        int revdiff=Math.abs((int)s.charAt(j)-s.charAt(j-1));
    if(revdiff!=diff){
        flag=true;
        break;
    }
    
    i++;
    j--;
    
    }
    
    if(flag){
        return "Not Funny";
    }
    else
        return "Funny";
    
    }

}