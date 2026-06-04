package Lecture_5;

import java.util.Scanner;
/**palindromic number pyramid*/

public class Exercise_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            for (int i = 1; i <= number; i++) {
                //Print space
                for (int j = 0; j < number - i; j++) {
                    System.out.print(" ");
                }
                //Print 'j' in descending order
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                //Print 'j' in ascending order from 2
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
