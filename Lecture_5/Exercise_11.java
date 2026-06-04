package Lecture_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Number Pyramid*/
public class Exercise_11 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            //Outer loop
            for (int i = 1; i <= number; i++) {
                //Inner loop - runs from 0 to (number-i) times
                for (int j = 0; j < number - i; j++) {
                    System.out.print(" ");
                }
                //Inner loop - runs from 0 to j times
                for (int j = 0; j < i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } catch ( InputMismatchException e) {
            System.out.println("INvalid. Enter digit only");
        }
    }

}
