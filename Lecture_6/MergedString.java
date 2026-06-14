package Lecture_6;

public class MergedString {

    public String mergeAlternately(String word1, String word2) {
        int total = Math.max(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < total; i++) {
            // Check i < word1 and append character per i
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                // Check i < word2 and append character per i
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       MergedString hello = new MergedString();
       String result = hello.mergeAlternately("abc", "pqrs");

       System.out.println("Result: " + result);
    }
}
