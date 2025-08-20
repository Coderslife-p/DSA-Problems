public class fibannaci {
    public static int  fib(int n){
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        int fib = fib(n-1) + fib(n-2);
        return fib;
    }
    public static void main(String[] args) {
        int n = 5 ;
        int result = fib(n);
        System.out.println(result);
    }
}
 