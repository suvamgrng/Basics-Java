package Lecture_5;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int size = sc.nextInt();

            // Outer loop
            for (int i = 1; i <= size; i++) {
                //Inner loop
                for (int j = 0; j < i; j++) {
                    System.out.print("*" + " ");
                }
                // Print nextLine
                System.out.println();
            }
        }
    }
}
