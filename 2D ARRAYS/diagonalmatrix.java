public class diagonalmatrix {
    public static void Diagonal(int arr[][]){
        int sum = 0;
        int secSum =0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if (i==j){
                    sum+=arr[i][j];
                    secSum+=arr[i][arr.length-1-i];
                }
            }
        }System.out.println(sum);
        System.out.println(secSum);
    // }public static void Print(int arr[][]){
    //     for(int i = 0;i<arr.length;i++){
    //         for(int j = 0;j<arr.length-1;j++){
    //             System.out.println(arr[i][j]);
    //         }
    //     }
     }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
                    Diagonal(arr);   
                    //Print(arr);
    }
}
