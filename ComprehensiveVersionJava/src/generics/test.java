package generics;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("num1: ");
        int num1 = in.nextInt();
        System.out.println("num2: ");
        int num2 = in.nextInt();
        System.out.println("num3: ");
        int num3 = in.nextInt();
        findLargest(num1, num2, num3);
        System.out.println();
    }

    public static int findLargest(int num1, int num2, int num3) {
        int largest;
        if (num1 > num2 && num1 > num3) {
            largest = num1;
        } else if (num2 > num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        System.out.println("the largest num is: " + largest);
        return largest;
    }
}
