public class reverseArray {
    public static void Reverse(int arr[][]){
        int rs = 0;
        int re = arr.length-1;
        int cs = 0;
        int ce = arr[0].length-1;
        for(int i =re;i>=rs;i--){
            for(int j = ce;j>=cs;j--){
                System.out.print(arr[i][j]+" ");
            }

        }System.out.println( );
    }
    public static void main(String[] args) {
         int[][] arr = {{1, 2, 3, 4}};

                       Reverse(arr);
    }
}
