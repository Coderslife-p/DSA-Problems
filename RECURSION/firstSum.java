public class firstSum {

    public static int Naturals(int n){
        if(n==0){
            return 0;
        }
        return n+Naturals(n-1);

    }
    public static void main(String[] args) {
        int n = 6;
         int res = Naturals(n);
         System.out.println(res);
    }
}
