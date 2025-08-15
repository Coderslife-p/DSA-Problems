public class sumOfSeondRow {
    public static void Sum(int arr[][]){
        int sum = 0;
        int col = arr[1].length ;
            for(int j = 0;j<col;j++){
                sum+=arr[1][j];
        }System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
            Sum(arr);
    }
}
