public class MissingNumber {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        printArray(arr);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 7, 3, 4, 9};
        findMissingNumber(arr);
    }
}
