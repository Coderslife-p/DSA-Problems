public class countfrequency {
    public static boolean countingNum(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return false;
                }
               
            
    }
}return true;
}
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 4, 5, 6, 6 };
         boolean res=countingNum(arr);
         System.out.println(res);

    }
}
