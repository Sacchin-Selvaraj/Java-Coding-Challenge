package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Sum4 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5};
        int num = 8;
        System.out.println(find4Sum(nums, num));
    }

    private static List<List<Integer>> find4Sum(int[] nums, int num) {
        List<List<Integer>> list = new ArrayList<>();
        int m = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int k = j + 1;
                while (k < m) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[m];
                    if (sum > num) {
                        m--;
                    } else if (sum < num) {
                        k++;
                    } else {
                        List<Integer> list1 = List.of(nums[i], nums[j], nums[k], nums[m]);
                        list.add(list1);
                        k++;
                        m--;
                        while (k < m && nums[k] == nums[k - 1]) k++;
                        while (k < m && nums[m] == nums[m + 1]) m--;
                    }
                }
            }
        }
        return list;
    }
}
