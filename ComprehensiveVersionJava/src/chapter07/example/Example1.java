package chapter07.example;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        int[][] m = getArray();    //  get an array from method

        //  display sum of elements
        System.out.println("Sum of all elements is " + sum(m));
    }

    public static int[][] getArray() {
        //  create a Scanner
        Scanner in = new Scanner(System.in);

        //  enter array values
        int[][] m = new int[3][4];
        System.out.println("enter " + m.length + " rows and " + m[0].length + " columns");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = in.nextInt();
            }
        }
        return m;
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                total = total + m[i][j];
            }
        }
        return total;
    }
}
