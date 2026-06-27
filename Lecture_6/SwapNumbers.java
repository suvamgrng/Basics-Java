package Lecture_6;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Before swapping");
        System.out.print("a = " + a + " " + " b = " + b);

        b = b - a;
        a = a + b;
        b = a - b;

        System.out.println("\nAfter swapping");
        System.out.print("a = " + a + " " + " b = " + b);
    }
}
