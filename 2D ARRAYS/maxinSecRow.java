public class maxinSecRow {
    public static void SecRow(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int ce = arr[0].length;
        for (int j = 0; j < ce; j++) {
            if (arr[1][j] > max) {
                max = arr[1][j];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { -5, -10, -3 }
        };
        SecRow(arr);
    }
}
