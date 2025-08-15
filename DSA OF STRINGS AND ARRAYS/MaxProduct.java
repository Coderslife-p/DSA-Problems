public class MaxProduct {
    public static void Product(int arr[]){
        int max1 = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
               max1 = Math.max(max1, arr[i] * arr[j]);
            }
        }System.out.println(max1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Product(arr);
    } 
}
