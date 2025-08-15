public class identity {
    public static void Identity(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 1&& i==j) {
                    System.out.println("Not an identity Matrix"); 
                    return;  
                }
                else if(arr[i][j] != 0&& i!=j){
                    System.out.println("Not an identity matrix");
                    return;
                }
            }
        }
        System.out.println("The entered MAtrix is Identity Matrix");
    }

    public static void main(String[] args) {
       int arr[][] = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
      Identity(arr);
    }
}
