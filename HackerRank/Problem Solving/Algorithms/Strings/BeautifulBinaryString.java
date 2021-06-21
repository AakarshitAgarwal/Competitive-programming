//1st way
public static int beautifulBinaryString(String b) {
    // Write your code here
    
    return((b.length()-b.replaceAll("010","").length())/3);

    }


//2nd way

public static int beautifulBinaryString(String b) {
    // Write your code here
    int l=b.length();
    int step=0;
    
    for(int i=2;i<l;i++){
        if(b.charAt(i)=='0' && b.charAt(i-2)=='0' && b.charAt(i-1)=='1'){
            step =step +1;
            i=i+2;
        }
    }
    
    return step;

    }


//3rd way

int l=b.length();
int step=0;
for(int i=0;i<=l-3;){
    if(b.substring(i,i+3).equals("010")){
        step++;
        i=i+3;
    }else{
        i++;
    }
}


// OR LEARN KMP Algorithm for Pattern Searching , Naive algorithm for Pattern Searching