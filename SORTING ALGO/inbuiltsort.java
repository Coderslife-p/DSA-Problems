import java.util.Arrays;
public class inbuiltsort {

    public static void PrintArrays(int arr[]){
    for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
    public static void main(String[] args) {
        int arr[]= {1,1,2,5,1,6,3,2};
        Arrays.sort(arr);
        PrintArrays(arr);
        
    }

    
}
