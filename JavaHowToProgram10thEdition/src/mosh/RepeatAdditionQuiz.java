package mosh;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() / 7 % 10);
        Scanner in = new Scanner(System.in);

        System.out.printf("What is " + num1 + " + " + num2 + "? ");
        int answer = in.nextInt();
        while (num1 + num2 != answer) {
            System.out.printf("Wrong answer. try again!! " + num1 + " + " + num2 + "? ");
            answer = in.nextInt();
        }
        System.out.printf("you got it!");
    }
}
