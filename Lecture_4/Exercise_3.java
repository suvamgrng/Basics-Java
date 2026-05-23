package Lecture_4;

import java.util.Scanner;

/**
 * Print if a number is prime or not (Input n from the user). */
public class Exercise_3 {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            boolean isPrime = true;

            if (number >= 2) {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("It is a prime number");
                } else {
                    System.out.println("It is not a prime number");
                }
            } else {
                System.out.println("Enter a number greater or equal to 2 to make it prime number");
            }
        }
    }
}
