package array;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        //  take input from the user
        Scanner in = new Scanner(System.in);

        int n;  //  declare size of n array
        System.out.println("Enter the size of the array: ");
        n = in.nextInt(); //  initialize the array size

        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();    //  initialize the array elements
        }

        System.out.println("The even elements are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println(" ");

        System.out.println("The odd elements are: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
