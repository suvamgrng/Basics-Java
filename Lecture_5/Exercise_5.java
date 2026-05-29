package Lecture_5;

import java.util.Scanner;
/**Right-Aligned Right Triangle*/

public class Exercise_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = 1; i < number; i++) {
                for (int j = 0; j < (number - i); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
