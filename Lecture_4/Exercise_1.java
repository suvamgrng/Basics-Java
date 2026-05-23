package Lecture_4;

import java.util.Scanner;

/**Print all even numbers till n.
 */
public class Exercise_1 {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            for (int i = 2; i <= number; i += 2) {
                System.out.print(i + " ");
            }
        }
    }
}
