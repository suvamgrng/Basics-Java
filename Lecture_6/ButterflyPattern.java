package Lecture_6;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            //Upper part
            for (int i = 1; i <= number; i++) {
                // print stars 0 to i times
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                //print spaces
                for (int j = 1; j <= 2 * (number - i); j++) {
                    System.out.print(" ");
                }
                //print stars in descending order
                for (int j = i; j >= 1 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //lower part
            for (int i = number; i>= 0; i--) {
                // print stars 0 to i times
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                //print spaces
                for (int j = 0; j < 2 * (number - i); j++) {
                    System.out.print(" ");
                }
                //print stars in descending order
                for (int j = i; j > 0 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
