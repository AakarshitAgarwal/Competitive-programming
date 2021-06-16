public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    // int count=1;
    // for(int i=0;i<candles.size();i++){
    //     for(int j=i+1;j<candles.size();j++){
    //         if(candles.get(i)==candles.get(j)){
    //             count++;
    //         }
    //         else if(candles.get(i)>candles.get(j)){
    //             count =1;
    //         }
    //     }
    // }
    // return count;
    int max =candles.get(0);
    int count=0;
    for(int i:candles){
        if(i>max){
            max=i;
        }
    }
    for(int j :candles){
        if(j==max){
            count++;
        }
    }
    
    return count;
    }

}