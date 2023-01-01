import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int @NotNull [] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }
}
