package Lecture_6;

public class AlphabetTriangle {
    public static void alphabetTriangle(int input) {
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        alphabetTriangle(5);
    }
}
