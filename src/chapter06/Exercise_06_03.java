package chapter06;


//  (Count occurence of numbers) write a program that reads the integers between 1 and 100 and counts the occurences of each.
//  Assume the input ends with 0.
//  Note that if a number occurs more than one time, the plural word 'times' is used in the output.
//  Numbers are displayed in increasing order


import java.util.Scanner;

public class Exercise_06_03 {
    //  main method
    public static void main(String[] args) {
        int[] counts = new int[100];    //  count the occurences of numbers

        //  prompt the user to enter integers between 1 and 100
        System.out.println("Enter the integers between 1 and 100: ");

        //  count occurence of numbers
        count(counts);

        //  display results
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }
    }

    //  method count reads integer between 1 and 100
    public static void count(int[] counts) {
        Scanner in = new Scanner(System.in);
        int num;    // holds input
        do {
            num = in.nextInt();
            if (num >= 1 && num <= 100) {
                counts[num - 1]++;

            }
        } while (num != 0);
    }
}