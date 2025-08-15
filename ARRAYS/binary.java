//package ARRAYS;

public class binary {
    public static int binarysearch(int arr[],int key){
        int low =0;
        int high =arr.length-1;
        while(low <= high){
            int mid = low+high/2;

            if(arr[mid]==key){
               return mid; 
            }
            if(arr[mid]<key){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int key = 4;
        int result = binarysearch(arr, key);
        System.out.println( "the nianry search element is " +result);
    
        
    }
}
