package Lecture_6;


public class ReverseString {
    public String reverse(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Invalid Input");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String text ="";
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(text));
    }
}

