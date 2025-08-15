public class srtrictlyincreasing {
    public static boolean increasing(int arr[]){
        for(int i = 0;i<arr.length-2;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
       int arr [] ={5,4,3,2,1
    };
        boolean res=increasing(arr);
        System.out.println(res);

    }
    
}
