public class SortedArray {

    public static boolean  increasing(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>=arr[i+1]){
           return false; 
        }return    increasing(arr , i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2 ,7,9,7,3};
        int i =0;
         boolean res = increasing(arr, i);
         System.out.println(res);
    }
}
