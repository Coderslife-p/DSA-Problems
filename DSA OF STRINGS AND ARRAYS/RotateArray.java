public class RotateArray {
    public static void Rotate(int arr[]){
        
        int n = arr.length;

        for (int k = 0; k < n; k++) {
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }arr[n - 1] = temp;
        }
    }
    public static void Print(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4};
        Rotate(arr);
        Print(arr);
    }
}
