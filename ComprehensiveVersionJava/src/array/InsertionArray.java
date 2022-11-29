package array;

import java.util.Arrays;

public class InsertionArray {
    //  method to add an element in the given specific position
    public static int[] insertX(int n, int[] arr, int x, int pos) {

        //  create a new array of size n+1
        int[] newArr = new int[n + 1];

        //  insert the elements from the old array into the new array

        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1) {
                newArr[i] = arr[i]; //  inser all elements till position
            } else if (i == pos - 1) {
                newArr[i] = x;    //  then insert element at specific position
            } else {
                newArr[i] = arr[i - 1]; //  then insert rest of the elements
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial array:\n" + Arrays.toString(arr));

        int x = 50;   //  enter the number to insert
        int pos = 5;  //  enter position where you want to insert
        arr = insertX(n, arr, x, pos);

        System.out.println("Array with " + x + " inserted at position " + pos + ":\n" + Arrays.toString(arr));
    }
}
