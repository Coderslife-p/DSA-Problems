public class evenodd {
    
    public static  void differenece(int arr[]){
        int es = 0;
        int os = 0;
        int result = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                es+=arr[i];
            }else {
                os+=arr[i];
            }
        }result = es-os;
        System.out.println(result);
    }

    public static void Print(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    
    
    public static void main(String[] args) {
    int arr[] = { 1,2,3,4,5,6,7,8};
    differenece(arr);
    //Print(arr);
}
    
}
