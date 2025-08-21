public class power {
    
    public static int Optimized(int a , int n ){
        if(n==0){
            return 1;
        }
        int b =Optimized(a,n/2);
        int halfPowSq =b*b;
        if(n%2 !=0){
            halfPowSq = a*halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(Optimized(a, n));
    }
}
