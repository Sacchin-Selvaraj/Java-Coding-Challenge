package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {-2, -2, -2, -1, -1, -1, 0, 0, 2, 2, 2, 2};
        int num = 0;
        System.out.println(find3Sum(nums, num));
    }

    private static List<List<Integer>> find3Sum(int[] nums, int num) {
        int j = 0, k = nums.length - 1;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            j = i + 1;
            List<Integer> list = new ArrayList<>();
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    list = List.of(nums[i], nums[j], nums[k]);
                    result.add(list);
                    j++;
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                    while (j < k && nums[j - 1] == nums[j]) {
                        j++;
                    }
                }
            }
        }

        return result;
    }
}
