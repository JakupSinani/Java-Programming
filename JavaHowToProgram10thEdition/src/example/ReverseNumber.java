package example;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter the number: ");
        int num = in.nextInt();
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }
        System.out.printf("Reversed number: " + reverse);
    }
}
