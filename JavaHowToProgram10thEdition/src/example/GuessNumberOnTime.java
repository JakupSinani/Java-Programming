package example;

import java.util.Scanner;

public class GuessNumberOnTime {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 105);
        Scanner in = new Scanner(System.in);

        int guess = 0;
        while (guess != number) {
            System.out.printf("\nEnter your guess: ");
            guess = in.nextInt();
            if (guess == number) {
                System.out.printf("yes the number is: " + number);
            } else if (guess > number) {
                System.out.printf("your guess is to high.");
            } else {
                System.out.printf("your guess is to low.");
            }
        }
    }
}
