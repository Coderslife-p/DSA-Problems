public class PairsSum {
    public static void pairsSum(int arr[],int target){
        for(int i = 0;i<arr.length;i++){ 
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
        int target = 4;
        pairsSum(arr, target);
    }
}
//for solving 3 pairs u need 3 loops and for n  numbers u need to follow recursion and backtracking