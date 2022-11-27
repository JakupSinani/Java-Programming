package array.examples;

import java.util.Scanner;

public class TwoSum {
    public static int[] twoSUm(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = {2, 7, 11, 15};


        int target = 26;

        int[] indices = twoSUm(nums, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No Solution found");
        }
    }
}
