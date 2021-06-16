class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    // Write your code here
    long temp =0;
    for(int i=0;i<ar.size();i++){
        temp=temp+ar.get(i);
    }
    return temp;
    }

}