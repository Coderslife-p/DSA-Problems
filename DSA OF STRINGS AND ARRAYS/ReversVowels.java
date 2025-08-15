public class ReversVowels {
    public static void reverseV(String s) {
        StringBuilder s1 = new StringBuilder(); 
        StringBuilder result = new StringBuilder(); 
        String s2 = "aeiouAEIOU";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i) == s2.charAt(j)) {
                    s1.append(s.charAt(i));
                }
            }
        }
        
        s1.reverse();
        
        int vowelIndex = 0;
        for (int k = 0; k < s.length(); k++) {
            if (s2.indexOf(s.charAt(k)) != -1) { 
                result.append(s1.charAt(vowelIndex));
                vowelIndex++;
            } else { 
                result.append(s.charAt(k));
            }
        }
        
        
        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = "ApplE";
        reverseV(s); 
    }
}
