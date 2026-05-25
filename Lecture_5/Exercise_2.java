package Lecture_5;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int rows = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter column: ");
            int col = sc.nextInt();
            sc.nextLine();

            // Outer loop
            for (int i = 1; i <= rows; i++) {
                // Inner loop
                for (int j = 1; j <= col; j++) {
                    //Only true if row and col are either 1 or 5 if not THEN else print
                    if (i == 1 || j == 1 || i == rows || j == col) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                // Print nextLine
                System.out.println();
            }
        }
    }
}
