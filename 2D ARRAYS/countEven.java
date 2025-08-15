public class countEven {
    public static void Count(int arr[][]) {
        int count = 0;
        int re = arr.length;
        int ce = arr[0].length;
        for (int i = 0; i < re; i++) {
            for (int j = 0; j < ce; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 6, 8 }, { 5, 8, 1 } };
        Count(arr);
    }
}
