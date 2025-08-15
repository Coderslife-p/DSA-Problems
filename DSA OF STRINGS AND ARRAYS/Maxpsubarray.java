public class Maxpsubarray {
    public static int Subarray(int arr[]) {
        int maxHere = arr[0];
        int minHere = arr[0];
        int maxSofar = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            int current = arr[i];
            if (current < 0)
            {
                int temp = maxHere;
                maxHere = minHere;
                minHere = temp;
            }
            maxHere = Math.max(current, maxHere * current);
            minHere = Math.min(current, minHere * current);
            maxSofar = Math.max(maxSofar, maxHere);
        }
        return maxSofar;
    }

        public static void main(String[] args) {
        int arr[] = { -2, 3, 4, - 1 };
        int result = Subarray(arr);
        System.out.println(result);
    }
}
