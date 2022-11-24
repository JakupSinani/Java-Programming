package chapter06.single_dimensional_arrays;

import java.util.Scanner;

public class Exercise_06_08 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int n;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(average(array));
    }

    public static double average(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        System.out.println(average);
        return average / array.length;

    }

    /*public static double average(double[] array) {
        return null;
    }*/
}
