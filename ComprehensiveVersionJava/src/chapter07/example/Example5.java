package chapter07.example;

public class Example5 {
    public static void main(String[] args) {
        printNumber(15);

        printNumber(5);
    }

    public static void printNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("[" + i + "]");
        }
    }
}
