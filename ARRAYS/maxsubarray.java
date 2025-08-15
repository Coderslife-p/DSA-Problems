//package ARRAYS;

public class maxsubarray {
    public static void msuarr(int arr[]) {

    
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = arr.length;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]= prefix[i-1]+arr[i];
            
        }

        for (int i = start; i < arr.length; i++) {
            for (int j = i; j < end; j++) {
               // int current = 0;
                for (int k = i; k <= j; k++) {
               //current += arr[k];
                }
               

                
        }
        System.out.println( "maximum subarray is "+ maxSum);
    }

    }
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8 };
        msuarr(arr);
    }

}
