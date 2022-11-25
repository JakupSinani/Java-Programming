package chapter05;

import java.util.Scanner;

//  (sort three numbers) write a method with the following header to display
//  three numbers in increasing order
public class Exercise_05_05 {
    //  main method
    public static void main(String[] args) {
        //  create a scanner
        Scanner in = new Scanner(System.in);

        System.out.println("ENter three numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if (num2 < num1 && num2 < num3) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        } else if (num3 < num1 && num3 < num2) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if (num3 < num2) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Display result
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
