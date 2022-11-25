package array.passing_array_to_method;

//  when passing an array to a method, the reference of the array is passed to the method


public class ArrayTestMethod {
    public static void main(String[] args) {
        int[] list = {3, 1, 2, 4, 6, 8, 2};
        printArray(list);
        System.out.println();
        printArray(new int[]{2, 84, 5, 6, 9115, 5, 53});

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
