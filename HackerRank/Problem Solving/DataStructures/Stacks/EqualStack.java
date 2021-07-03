class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    // Write your code here
    
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    Stack<Integer> s3=new Stack<Integer>();
    
    
    int max1=0;
    int max2=0;
    int max3=0;
    
    int minStack;
    
    for(int i=h1.size()-1;i>=0;i--){
        s1.push(h1.get(i));
        max1=max1+h1.get(i);
    }
    
    for(int i=h2.size()-1;i>=0;i--){
        s2.push(h2.get(i));
        max2=max2+h2.get(i);
    }
    
    for(int i=h3.size()-1;i>=0;i--){
        s3.push(h3.get(i));
        max3=max3+h3.get(i);
    }
    
    minStack=Math.min(max1,Math.min(max2,max3));
    
    while(max1!=max2 || max1!=max3){
        while(max1>minStack){
            max1=max1-s1.pop();
        }
        minStack=Math.min(max1,Math.min(max2,max3));
        
        while(max2>minStack){
            max2=max2-s2.pop();
        }
        minStack=Math.min(max1,Math.min(max2,max3));
        
        while(max3>minStack){
            max3=max3-s3.pop();
        }
        minStack=Math.min(max1,Math.min(max2,max3));
        
    }
        return minStack;
    }

}