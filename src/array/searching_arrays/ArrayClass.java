package array.searching_arrays;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
        System.out.println("Before sorting: ");
        for (double num : numbers) {
            System.out.println(num);
        }
        System.out.println("Before sorting, 2.9 index is: " + Arrays.binarySearch(numbers, 2.9));
        Arrays.sort(numbers);   //  sort the whole array
        System.out.println("After sorting: ");
        for (double num : numbers) {
            System.out.println(num);
        }

        System.out.println("After sorting, 2.9 index is: " + Arrays.binarySearch(numbers, 2.9));
    }
}
