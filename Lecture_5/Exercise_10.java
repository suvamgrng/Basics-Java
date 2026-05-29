package Lecture_5;

import java.util.Scanner;
/**Solid rhombus.*/

public class Exercise_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Input rows
            System.out.print("Enter rows: ");
            int row = sc.nextInt();

            // Input column
            System.out.print("Enter column: ");
            int cols = sc.nextInt();

            // Outer loop - rows
            for (int i = 1; i <= row; i++) {

                // To print white leading spaces
                int space = row - i;

                // Inner loop - columns(Prints " ")
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                // Inner loop - columns(Prints *)
                for (int j = 0; j < cols; j++) {
                    System.out.print("*" + " ");
                }
                // Print new line
                System.out.println();
            }
        }
    }
}
