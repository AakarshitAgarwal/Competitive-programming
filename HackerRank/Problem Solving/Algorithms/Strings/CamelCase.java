public static int camelcase(String s) {
    // Write your code here
    //code1
    String s1[]=s.split("[A-Z]");
    return(s1.length);
    //code2
    int term=1;
    for(int i=0;i<s.length();i++){
        String letter = Character.toString(s.charAt(i));    //To get String characters to another string one by one(typecasting)
        if(letter==letter.toUpperCase()){
            term++;
        }
    }
        return(term);
    }