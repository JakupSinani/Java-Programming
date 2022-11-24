package chapter06;

import java.util.Scanner;

public class Exercise_06_07 {
    //  main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = new int[100];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        for (int a : list) {
            if (a % 10 == 0) {
                System.out.println(a);
            } else
                System.out.print(a + " ");
        }

    }
}
