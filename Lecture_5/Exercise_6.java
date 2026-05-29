package Lecture_5;

import java.util.Scanner;
/**Left-Aligned Right Triangle Number Pattern.*/

public class Exercise_6 {
    public static void main(String[] args) {

        // It handles resources automatically
        try (Scanner sc = new Scanner(System.in)) {
            // Taking input from keyboard
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            //Outer loop
            for (int i = 1; i <= number; i++) {
                //Inner loop
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                //Prints nextLine
                System.out.println();
            }
        }
    }
}
