package chapter06.example;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = in.nextInt();
        System.out.println("ENter column: ");
        int column = in.nextInt();
        int total = 0;
        int[][] arr = new int[row][column];
        System.out.println("fill the rows and columns: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
                total += arr[i][j];
                System.out.println(j);
            }
        }
        System.out.println(total);
    }
}
