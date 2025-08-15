public class pairsums{

    public static void Sum(int arr[]){
        int target =7;
        int as = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
            as=arr[i]+arr[j];
            if(target == as){
           System.out.println(as);
           System.out.println("pairs found"+arr[i]+""+arr[j]);
            return ;
        }}

        } 
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7};
        Sum(arr);
    }

}