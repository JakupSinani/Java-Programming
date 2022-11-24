package array.searching_arrays;
//  The binary search first compare the key with the element in the middle of the array.
//  Consider the following three cases:
//  1.If the key is less than the middle element, you need to continue to search for the key only in the first half of the array.
//  2.If the key is equal to the middle element, the search ends with a match.
//  3.If the key is greater than the middle element, you need to continue to search for the key only in the second hals of the array

public class BinarySearchApproach {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySearch(list, 2);     //  returns 0
        int j = binarySearch(list, 11);    // returns 4
        int k = binarySearch(list, 12);    // returns -6
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;  //  now high < low, key not found
    }
}
