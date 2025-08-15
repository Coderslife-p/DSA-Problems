
public class linearsearch {
    public static int linear(int numbers[], int keys) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == keys) {
                return i;
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,10,5,6};
        int keys = 10;
        int index = linear(numbers, keys);
        if (index==-1){
            System.out.println("Not found");
        }
        else{
        System.out.println("The key is found at the specific index: "+ index);
        }
    }
}
