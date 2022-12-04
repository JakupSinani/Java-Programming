package arrays_list_autoboxing_unboxing.challenge.array_challenge;

import java.util.Arrays;

public class ReverseArray {
    /*
    public static void main(String[] args) {
    int[]arr={1,2,3,4,5};
    reverse(arr);
    }
    public static void reverse(int[]arr){
        for (int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }*/

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    private static void reverse(int[] arr) {
        int maxIndex = arr.length - 1;
        int halfLength = arr.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
    }
}
