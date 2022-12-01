package chapter08;

import java.util.Scanner;

public class Exercise_08_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and colimns in the array: ");
        int row = in.nextInt();
        int column = in.nextInt();
        double[][] arr = new double[row][column];

        System.out.println("Enter the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
    }
}
