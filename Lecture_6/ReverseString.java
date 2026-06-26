package Lecture_6;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter something: ");
            String text = sc.nextLine();

            StringBuilder reversedText = new StringBuilder(); // Mutable and modifies the existing object instead of creating a new object.
            for (int i = text.length()-1; i >= 0; i--) {
                reversedText.append(text.charAt(i)); // add each iterated character at the end.
            }
            System.out.println(reversedText);
        }
    }
}
