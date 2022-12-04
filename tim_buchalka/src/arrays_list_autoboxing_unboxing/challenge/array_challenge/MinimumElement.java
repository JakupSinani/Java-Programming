package arrays_list_autoboxing_unboxing.challenge.array_challenge;

import java.util.Scanner;

public class MinimumElement {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int num = in.nextInt();
        int[] returnedArray = readIntegers(num);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedArray);
    }

    private static int[] readIntegers(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            array[i] = in.nextInt();
        }
        return array;
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
