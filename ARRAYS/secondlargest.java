public class secondlargest {
    public static void SecondLargest(int arr[]){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]!=max1&&arr[i]>max2){
                max2 = arr[i];
            }
        
        }System.out.println(max2);
        System.out.println(max1);
    }



    public static void main(String[] args) {
        int arr[]={4,2,3,5};
        SecondLargest(arr);
        
    }
    
}
