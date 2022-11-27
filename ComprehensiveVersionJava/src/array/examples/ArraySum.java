package array.examples;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        for (int a : arr) {
            System.out.println(a);
        }
        sum3(arr);
    }

    public static int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
        return sum;
    }
}
