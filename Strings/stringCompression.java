public class stringCompression {
    public static void Compression(String str) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count += 1;
            } else {
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        if (count > 1) {
            sb.append(count);
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        String str = "aabcccsdeffhiikllp";
        Compression(str);

    }
}
