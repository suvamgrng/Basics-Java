package Lecture_6;

public class MergedString {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = Math.max(word1.length(), word2.length()); // Gives maximum size of between two element.

        for (int i = 0; i < n; i++) {
            if (i < word1.length()) { // If index size is lower than word length then append character.
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) { // If index size is lower than word length then append character.
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString(); // Return a string not StringBuilder
    }
    public static void main(String[] args) {
       MergedString mergedString = new MergedString();
       String result = mergedString.mergeAlternately("abc", "pqrs");
        System.out.println(result);
    }
}
