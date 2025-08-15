public class largestString {
    public static void main(String[] args) {
        String str [] = {"Aplle","mango","Banana"};
        String Largest = str[0];
        for(int i = 0;i<str.length;i++){
        if(Largest.compareTo(str[i])<0){
            Largest = str[i];
        }
    }System.out.println(Largest);
}
}
