import java.util.Arrays;

public class duplicates {
    public static void Duplicates(int arr[]) {

        int count = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count += 1;
            } else {
                if (count > 2) {
                    System.out.println(arr[i - 1]);
                    count = 1;
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 5, 2, 3 ,3,3};
        Arrays.sort(arr);
        Duplicates(arr);
    }

}
