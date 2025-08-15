public class selectionsort {

    public static void selectionSort(int arr[]){
        
        for(int i =0;i<arr.length-2;i++){
            int max = i;
            for(int j =i+1;j<arr.length-1;j++){
                if(arr[max]>arr[j]){
                    max=j;
                }
            }int temp =arr[max];
        arr[max]=arr[i];
        arr[i]=temp;
        }

    }
    public static void PrintArray(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4 ,3, 12 ,4};
        selectionSort(arr);
        PrintArray(arr);
        
        
    }
    
}
