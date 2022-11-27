package array.examples;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        findMaxConcecutiveOnes(nums);

    }

    public static int findMaxConcecutiveOnes(int[] nums) {
        int countOne = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                countOne++;
            } else if (nums[i] == 0) {
                break;
            }
        }
        System.out.println(countOne);
        return countOne;
    }
}
