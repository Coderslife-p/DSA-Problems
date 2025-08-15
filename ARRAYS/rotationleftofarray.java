public class rotationleftofarray {
    public static void leftRotate(int arr[]) {

        int n = arr.length;

        for (int k = 0; k < 7; k++) {
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
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        leftRotate(arr);
        Print(arr);
    }
}
