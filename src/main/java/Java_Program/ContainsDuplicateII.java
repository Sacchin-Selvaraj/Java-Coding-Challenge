package Java_Program;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (seen.containsKey(val) && i - seen.get(val) <= k) {
                return true;
            }
            seen.put(val, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }
}
