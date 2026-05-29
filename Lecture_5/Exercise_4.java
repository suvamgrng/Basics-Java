package Lecture_5;

import java.util.Scanner;
/**Inverted Right Triangle pattern*/

public class Exercise_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Outer loop to iterate rows
            for (int i = number; i > 0 ; i--) {
                // Inner loop to iterate cols
                for (int j = 0; j < i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }
}
