package Lecture_5;

import java.util.Scanner;
/**Floyd's Triangle.*/

public class Exercise_8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int digit = 1;

            for (int i = 1; i <= number; i++) {

                for (int j = 1; j <= i; j++) {
                    System.out.print((digit) + " ");
                    digit++;
                }
                System.out.println();
            }
        }
    }
}
