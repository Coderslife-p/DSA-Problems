public class firstOccurance {
    public static int Occurance(int arr[] ,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return Occurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {12,2,3,4,4};
        int k= 4;
        int i =0;
        int res= Occurance(arr, k, i);
        System.out.println(res);
    }
}
