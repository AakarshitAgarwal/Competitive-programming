public static int theLoveLetterMystery(String s) {
    // Write your code here
    int count=0;
    int i=0;
    int j=s.length()-1;
    while(i<j){
        
        count =count + Math.abs(s.charAt(i)-s.charAt(j));
        i++;j--;
    }
    return count;

    }
