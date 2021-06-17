public static String timeConversion(String s) {
    // Write your code here
    String s1[]=s.split(":");
    char c[]=s1[2].toCharArray();
    if(s1[2].contains("PM")){
        if(s1[0].contains("12")){
            return s1[0]+":"+s1[1]+":"+c[0]+c[1];    
        }
        else{
        int n=Integer.parseInt(s1[0]);
            n=n+12;
            return n+":"+s1[1]+":"+c[0]+c[1];
        }
    }
    else{
        if(s1[0].contains("12")){
            String n="00";
            return n+":"+s1[1]+":"+c[0]+c[1];
        }
        else{
            return s1[0]+":"+s1[1]+":"+c[0]+c[1];
        }
    }
    }