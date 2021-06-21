public static int palindromeIndex(String s) {
    // Write your code here
    int i,j;
    for(i=0,j=s.length()-1;i<j;i++,j--){
        if(s.charAt(i)!=s.charAt(j)){
            if(s.charAt(i+1)==s.charAt(j)){
                return (i);
            }
            if(s.charAt(i)==s.charAt(j-1)){
                return (j);
            }
        }
    }
        return -1;
    }