public class RemoveStrP {
    public static void Palindrome(String str) {
        int rightP = str.length() - 1;
        int leftP = 0;

        StringBuilder sb = new StringBuilder(str);

while (leftP < rightP) {
    if (sb.charAt(leftP) != sb.charAt(rightP)) {
        
        sb.setCharAt(rightP, sb.charAt(leftP));
    }
    leftP++;
    rightP--;
}

System.out.println("Palindrome formed: " + sb);

    }
    public static void main(String[] args) {
        String str = "madbm";
        Palindrome(str);
    }
}

//this is the two pointer approach used in solving palindrome