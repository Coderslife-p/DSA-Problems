
public class decresing {

    public static void printDEc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        
        printDEc(n-1);//reverse it for decraesing order
        System.out.println(n+" ");

    }
    public static void main(String[] args) {
        int n =  5;
        printDEc(n);
    }
    
}
