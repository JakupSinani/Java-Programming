package arrays_list_autoboxing_unboxing;

import java.util.Scanner;

public class Main {
    /*public static void main(String[] args) {
     *//*    int[] myVariable;
    myVariable=new int[10];*//*
        int[]myIntArray=new int[10];

        for (int i=0;i< myIntArray.length;i++){
            myIntArray[i]=i*10;
        }

        printArray(myIntArray);
    }
    public static void printArray(int []array){
        for (int i=0;i< array.length;i++){
            System.out.println("Element "+i+", value is "+array[i]);
        }
    }*/


    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static double getAverage(int[] arrays) {
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        return (double) sum / (double) arrays.length;
    }
}
