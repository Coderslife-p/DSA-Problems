//package ARRAYS;


public class reverse {
    public static int reversearrsy(int arr[],int n){

        int first = 0;
        int last = arr.length-1;
        while(first < last){
            int temp  = arr[last];
            arr[last]=arr[first];
            arr[first]=temp; 
            first++;
            last--;
        }
        
        return 1;
    }
    public static void main(String[] args) {
        int arr[ ] = {1,2,3,4,5,6,7};
        reversearrsy(arr, 0);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    
}
