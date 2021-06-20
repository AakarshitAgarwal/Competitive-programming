public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double positive=0;
    double negative=0;
    double zeros=0;
    double size=arr.size();
    for(int i=0;i<size;i++){
        if(arr.get(i)>0){
            positive++;
        }
        else if(arr.get(i)<0){
            negative++;
        }
        else{
            zeros++;
        }
    }
    double r1=(positive/size);
    double r2=(negative/size);
    double r3=(zeros/size);
    
    DecimalFormat df = new DecimalFormat();     //How to use decimal format in java to setMaximumFractionDigits
    df.setMaximumFractionDigits(6);
    
    System.out.println(df.format(r1));
    System.out.println(df.format(r2));
    System.out.println(df.format(r3));
    // System.out.printf("%.6f",r1);
    // System.out.printf("%.6f",r2);
    // System.out.printf("%.6f",r3);
    
    }

}