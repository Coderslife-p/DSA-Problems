//package ARRAYS;

public class subarrays {
    public static void subarr(int arr[]) {
        int start = 0;
        int end = arr.length;
        for (int i = start; i < arr.length; i++) {
            for (int j = i; j < end; j++) {
                for (int k = i; k <= j; k++) {
                System.out.print(arr[k]+" ");
                }
                System.out.println( );

            }
        }
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3};
        subarr(arr);
    }
}
