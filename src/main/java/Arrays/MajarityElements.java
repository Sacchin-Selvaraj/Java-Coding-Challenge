package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajarityElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 4, 4, 4};
        System.out.println(Arrays.toString(findMajority1(nums)));
        System.out.println(Arrays.toString(findMajority2(nums)));
    }

    private static int[] findMajority2(int[] nums) {
        // optimal
        int count1 = 0, count2 = 0, el1 = 0, el2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && el2 != nums[i]) {
                el1 = nums[i];
                count1++;
            } else if (count2 == 0 && nums[i] != el1) {
                el2 = nums[i];
                count2++;
            } else if (el1 == nums[i]) {
                count1++;
            } else if (el2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (el1 == nums[i]) count1++;
            if (el2 == nums[i]) count2++;
        }
        int first = -1, second = -1;
        if (count1 > nums.length / 3)
            first = el1;
        if (count2 > nums.length / 3)
            second = el2;
        return new int[]{first, second};
    }

    private static Integer[] findMajority1(int[] nums) {
        // my solution (0(n)) // not optimal;
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > nums.length / 3) {
                list.add(nums[i]);
            }
        }
        return list.toArray(new Integer[0]);
    }
}
