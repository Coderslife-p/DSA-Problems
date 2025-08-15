public class elementswithzero {
    public static void Replace(int arr[][]){
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<=arr[0].length-1;j++){
                arr[i][j]=0; 
                System.out.print(arr[i][j]);
            } System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        Replace(arr);

    }
}
