package Lecture_6;

import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Upper part
            for (int i = 1; i <= number; i++) {
                
                // Print stars
                for (int j = 1; j <= i; j++) {
                    if (i == j || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Print space
                for (int j = 1; j <= (number - i) * 2; j++) {
                    System.out.print(" ");
                }
                // Print stars in descending order
                for (int j = i; j >= 1; j--) {
                    if (j == 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // Lower part
            for (int i = number; i >= 1; i--) {

                // Print stars
                for (int j = 1; j <= i; j++) {
                    if (i == j || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // Print space
                for (int j = 1; j <= (number - i) * 2; j++) {
                    System.out.print(" ");
                }
                // Print stars in descending order
                for (int j = i; j >= 1; j--) {
                    if (j == 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
