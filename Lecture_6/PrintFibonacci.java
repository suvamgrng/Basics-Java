package Lecture_6;
/**1 1 2 3 5 8 13*/
public class PrintFibonacci {
    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(b + " ");
            int temp = a + b;
            a = b;
            b = temp;


        }
    }
    public static void main(String[] args) {
        fibonacci(7);
    }
}
