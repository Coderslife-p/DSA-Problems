public class insertionjsort {
    public static void InsertionSort(int arr[]){
            for(int i = 1;i<arr.length;i++){
                int curr = arr[i];
                int prev =i-1;//findong out the correct position 
                while(prev >=0 && arr[prev]>curr){
                    arr[prev+1]=arr[prev];
                        prev--;
                }
                //insertion
                arr[prev+1]=curr;
            }
    }
    public static void PrintArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int arr[] ={1,6,2,14,4,6};
        InsertionSort(arr);
        PrintArray(arr);
        
    }
    
}
