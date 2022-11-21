public class fibonacci{
    
    public static void main(String[] args){
        System.out.println(function(30));
    }

    public static int[] fib_cache = new int[100];
    public static int function(int n){
        if(n<=1) return n;
        if(fib_cache[n]!=0) return fib_cache[n];

        return fib_cache[n] = function(n-1)+function(n-2);
    } 
}
