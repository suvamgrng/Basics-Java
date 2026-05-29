package Lecture_5;

import java.util.Scanner;
/** Inverted Left-Aligned Right Triangle Number Pattern.*/

public class Exercise_7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = number; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                // Print nextLine
                System.out.println();
            }
        }
    }
}
