package chapter05;

public class Exercise_05_03 {
    public static void main(String[] args) {
        int num = 2147447412;
        if (isPalindrom(num)) {
            System.out.println(num + " is palindrom");
        } else {
            System.out.println(num + " is not palindrom");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + (number % 10);
            number = number / 10;
        }
        return reverse;
    }

    public static boolean isPalindrom(int number) {
        return (number == reverse(number));
    }
}
