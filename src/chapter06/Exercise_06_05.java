package chapter06;

import java.util.Scanner;

public class Exercise_06_05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] distictNumbers = new int[10];   //  array of length 10
        int num;    //  user input
        int count = 0;    //  Number of distinct numbers

        //  prompt the user to enter ten numbers
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < distictNumbers.length; i++) {
            num = in.nextInt();

            //  test if num is distinct
            if (isDistinct(distictNumbers, num)) {
                distictNumbers[count] = num;
                count++;    // increement count
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.println("The distinct numbers are: ");
        for (int i = 0; i < distictNumbers.length; i++) {
            if (distictNumbers[i] > 0) {
                System.out.println(" " + distictNumbers[i]);
            }
        }
        System.out.println();
    }

    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return false;
            }

        }
        return true;
    }
}
