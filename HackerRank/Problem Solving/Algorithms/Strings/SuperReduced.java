// public static String superReducedString(String s) {
    public class SuperReduced{
        public static void main(String args[]){
    // Write your code here
    String s="aaabccddd";
    for(int i=1;i<s.length();i++)
    {
        if(s.charAt(i)==s.charAt(i-1))
        {
            s=s.substring(0,i-1) + s.substring(i+1);
            // s.remove(i-1,i+1);
            i=0;
        }
    }
    if(s.length()==0){
        System.out.println("Empty String");
    }else{
        System.out.println(s);
        }
    } 
}