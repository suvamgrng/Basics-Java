package Lecture_6;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = 1; i <= number; i++) {
                //Print stars
                for (int j = 0; j < number - i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
