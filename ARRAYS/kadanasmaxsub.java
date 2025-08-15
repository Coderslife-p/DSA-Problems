//package ARRAYS;


public class kadanasmaxsub {
    public static void  kadanas(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs =cs+arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs ,ms);
        }
        System.out.println("MAximum subarray sum is " +ms);
    }

    public static void main(String[] args) {
        int arr[] ={-1,1,2,3,-2};
        kadanas(arr);
    }
    
}
