public class NonRepeating {
    public static void NR(String str) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int flag = 0;

            for (int j = 0; j < str.length(); j++) {
                if (i != j&&str.charAt(i) == str.charAt(j) ) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                s.append(str.charAt(i));
            }
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "hammar";
        NR(str);
    }
}
