package chapter06.single_dimensional_arrays;

import java.util.Scanner;

//  find the smallest eleenent
public class Exercise_06_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter 10 numbers: ");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
            System.out.println(list[i]);
        }
        min(list);
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        System.out.println("min is: " + min);
        return min;
    }
}
