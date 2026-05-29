package Lecture_5;

import java.util.Scanner;
/**0-1 Triangle*/

public class Exercise_9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int digit = 0;

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= i; j++) {

                    // Checking odd and even
                    if (digit % 2 == 0) { // proceed if even
                        System.out.print("0" + " ");
                    } else { // proceed if odd
                        System.out.print("1" + " ");
                    }
                    digit++;
                }
                System.out.println();
            }
        }
    }
}
