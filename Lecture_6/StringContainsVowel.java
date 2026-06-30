package Lecture_6;
/**Write a Java program to check if a vowel is present in a string
 */
public class StringContainsVowel {
    public static boolean checkVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        System.out.println(checkVowel("Hello"));
        System.out.println(checkVowel(""));
    }
}
