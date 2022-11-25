package chapter06.single_dimensional_arrays;

//  (Reverse an array)
//  write a test program that prompts the user to enter 10 numbers, invokes the method to reverse the numbers,
//  and displays the numbers

import java.util.Scanner;

public class Example_06_12 {
    //  main method
    public static void main(String[] args) {
        //  create a array
        int[] list = new int[10];
        //  create a Scanner
        Scanner in = new Scanner(System.in);
        //  prompt the user to enter 10 numbers
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = in.nextInt();
        }


        //  invoke reverse method
        reverse(list);
    }

    //  method to reverse array
    public static int[] reverse(int[] list) {
        //  i start from last element in array and decremented
        for (int i = list.length - 1; i >= 0; i--) {
            // now print in reverse
            System.out.print(list[i] + " ");
        }

        return list;
    }
}
