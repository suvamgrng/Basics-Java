package Lecture_4;

import java.util.Scanner;

/**
 * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
 * If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
 * If they enter 0 then stop.
 * If he/ she scores :
 * Marks >=90 -> print “This is Good”
 * 89 >= Marks >= 60 -> print “This is also Good”
 * 59 >= Marks >= 0 -> print “This is Good as well”
 * 	Because marks don’t matter but our effort does.
 * (Hint : use do-while loop but think & understand why)*/
public class Exercise_2 {
    public static void main(String[] args) {
        int number = 0;
        int marks = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.print("Enter a number(1/0): ");
                number = sc.nextInt();

                if ( number == 0) {
                    System.out.println("Thank you for coming.");
                    break;
                }
                if ( number != 1) {
                    System.out.println("Enter valid number(either 0/1)");
                }
                if (number == 1) {
                    System.out.print("Enter your marks: ");
                    marks = sc.nextInt();

                    if (marks >= 90) {
                        System.out.println("This is good");
                    } else if (marks >= 60) {
                        System.out.println("This is also good");
                    } else if (marks >= 0) {
                        System.out.println("This is good as well");
                    }
                }
            } while (number != 0);
        }
    }
}