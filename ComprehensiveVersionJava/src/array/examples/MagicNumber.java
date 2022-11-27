package array.examples;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        number = in.nextInt();

        //  call isMagic to text the input
        if (isMagic(number)) {
            System.out.println(number + "is a magic number");
        } else {
            System.out.println(number + " is not a magic number");
        }
        in.close();
    }

    public static boolean isMagic(int number) {
        boolean isMagic = false;  //  shall change to true if found a digit 8

        //  extrat and check each digit
        while (number > 0) {
            int digit = number % 10;    //  extract the latest digit
            if (digit == 8) {
                isMagic = true;
                break;  //  only need to find one digit 8
            }
            number /= 10;
        }
        return isMagic;
    }
}
