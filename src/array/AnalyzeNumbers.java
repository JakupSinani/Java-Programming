package array;

import java.util.Scanner;

//  arrayRefVar = new elementType[arraySize];
//  this statement does two things:
//  1. it creates an array using new elementType[arraySize]
//  2. it assign the reference of the newly created array to the variable arrayRefvar

//  double[] arrayRefVar = new double[10]
//  this statement declares an array variable, creates an array of ten elements of double


public class AnalyzeNumbers {
    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS = 10;
        double[] numbers = new double[NUMBER_OF_ELEMENTS];     //  create a array with specific capacity
        double sum = 0;

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a new number: ");
            numbers[i] = in.nextDouble();     //  store number in array
            sum += numbers[i];
        }
        double average = sum / NUMBER_OF_ELEMENTS;      //  get average

        int count = 0;        //  the number of elements above average
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            if (numbers[i] > average) {
                count++;    // count numbers above average
            }
        }
        System.out.println("Average is: " + average);
        System.out.println("Number of elements above the average " + count);
    }
}
