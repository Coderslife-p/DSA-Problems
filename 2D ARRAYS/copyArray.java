import java.util.Arrays;

public class copyArray {
    public static void CopyArray(int arr[][]){
        int[][] Empty = new int[arr.length][arr[0].length];
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                Empty[i][j]=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(Empty));
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        CopyArray(arr);
        
    }
    
}
