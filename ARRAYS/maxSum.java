//package ARRAYS;

public class maxSum {
        public static int max(int arr[]){
            int max = arr[0];
            for(int i =0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
            }System.out.println(max);
            return -1;
        }
    public static void main(String[] args) {
        int arr[] = {-1,-45,-90,-4};//-0 is as same 0 int the java 
        int result = max(arr);  
        System.out.println(result);
    }
}
