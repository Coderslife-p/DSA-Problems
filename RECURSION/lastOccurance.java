public class lastOccurance {
    public static int Last(int arr[] , int key,int i){
        if(i==arr.length){
            return -1;
        }
        int restIndex = Last(arr, key, i + 1);

         if (restIndex != -1) {
            return restIndex;//to check the last occurance
        }
        if (arr[i] == key) {
            return i; 
        }

        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {-1, 0, -5, 0};
        int key = 0;
        int i = 0;
        int res = Last(arr, key, i);
        System.out.println(res);

    }
}
