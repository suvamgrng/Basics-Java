package Lecture_6;
/**Write a Java program to check if the given number is a prime number*/
public class PrimeNumberCheck {
    public static boolean isPrime(Integer input) {
        if (input == null || input < 2) {
            throw new IllegalArgumentException("Invalid. Enter a number");
        }

        for (int i = 2; i < Math.sqrt(input) ; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
}
