public static int alternatingCharacters(String s) {
    // Write your code here
    int size=s.length();
    int count=0;
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
            // s=s.substring(i-1) + s.substring(i+1,size);
            count=count+1;
        }
    }
    return count;
    }

