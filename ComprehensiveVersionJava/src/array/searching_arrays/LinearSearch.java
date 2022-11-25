package array.searching_arrays;

public class LinearSearch {
    //  main method
    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};

        int j = linearSearch(list, 2);
    }

    //  the method for finding a key in the list
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                System.out.println(list[i] + " index is " + i);

                return i;
            }
        }
        return -1;
    }
}
