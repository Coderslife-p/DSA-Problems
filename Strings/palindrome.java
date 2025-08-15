  public class palindrome {


    public static void Plaindrome(String str){
        int n = str.length();
        str = str.toLowerCase();
        for(int i =0 ;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("the entered strings are not palindrome");
                return ;
            }
        }System.out.println("the entered strings are  palindrome");
    }
    
    public static void main(String[] args) {
        String str = "Madam";
        Plaindrome(str);
    }
}
