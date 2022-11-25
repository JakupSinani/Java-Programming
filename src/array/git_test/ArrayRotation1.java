package array.git_test;

public class ArrayRotation1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        int rotation = 5;

        //  if rotation is greater than the length of the array
        if (rotation > arr.length) {
            rotation = rotation % arr.length;

            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[(i + arr.length - rotation) % arr.length];
            }
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(arr2[i] + " ");
            }
        }
    }
}
