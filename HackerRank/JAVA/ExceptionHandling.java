
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    
    long power(int n,int p) throws Exception{
        if (n<0 || p<0){
             throw new Exception ("n or p should not be negative.");
        } 
        else if (n == 0 && p == 0){
            throw new Exception ("n and p should not be zero.");
        }
        else {
        long temp=1;
        // int a=n;
        // int b=p;
        for(int i=1;i<=p;i++){
            temp=temp*n;
        }
        return temp;
        }
    }    
}

public class ExceptionHandling {
    
}
