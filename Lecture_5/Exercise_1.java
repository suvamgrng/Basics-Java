package Lecture_5;

import java.util.Scanner;

/**
 * *****
 * *****
 * *****
 * *****
 * */
public class Exercise_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter columns: ");
            int cols = scanner.nextInt();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }
}
