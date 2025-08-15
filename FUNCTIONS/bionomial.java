public class bionomial {
    public static int fact(int n){
        int factorial = 1;
        for(int i = 1;i<=n; i++){
            factorial = factorial * i;
        } return factorial;
    }

    public static int fact1(int r){
        int factorial1 = 1;
        for(int i = 1;i<=r;i++){
            factorial1 = factorial1*i;
        }return factorial1;
    }

    public static int fact2(int x){
        int factorial2 = 1;
        for(int i = 1;i<=x;i++){
            factorial2 = factorial2*i;
        }return factorial2;
    }

    public static void main(String[] args) {
        int a = fact(5);
        int b = fact1(2);
        int c = fact2(5-2);
        int result = a/(b*c);
        System.out.println("The bionomial coefficeint of the enetered numebers is : " +result);  
    }
}
