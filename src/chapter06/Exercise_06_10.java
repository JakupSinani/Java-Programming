package chapter06;

import java.util.Scanner;

//  fin the index of the smallest element
public class Exercise_06_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter 10 numbers: ");
        double[] list = new double[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
            System.out.println(list[i]);
        }
        minIndex(list);
    }

    public static double minIndex(double[] min) {
        double minIndexx = min[0];
        int indexOfMin = 0;
        for (int i = 0; i < min.length; i++) {
            if (min[i] <= minIndexx) {
                minIndexx = min[i];
                indexOfMin = i;
            }
        }
        System.out.println("index of min is: " + indexOfMin);
        return minIndexx;
    }
}
