package Arrays;

import java.util.Arrays;

public class ReversePairs {

    public static void main(String[] args) {
        int[] nums = {40, 25, 19, 12, 9, 6, 2};
        int count = 0;
        System.out.println(reversePairs(nums, 0, nums.length - 1, count));
        System.out.println(Arrays.toString(nums));
    }

    private static int reversePairs(int[] nums, int start, int end, int count) {

        if (start >= end) {
            return 0;
        }
        int mid = (start + end) / 2;
        count += reversePairs(nums, start, mid, count);
        count += reversePairs(nums, mid + 1, end, count);
        count += findReversePairs(nums, start, mid, end, count);
        return count;

    }

    private static int findReversePairs(int[] nums, int start, int mid, int end, int count) {

        int left = start;
        int right = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];
        int rights = mid + 1;
        for (int i = start; i < mid; i++) {
            while (rights <= end && nums[i] > 2 * nums[rights]) {
                rights++;
                count += rights-(mid+1);
            }
        }
        while (left <= mid && right <= end) {
            if (nums[left] < nums[right]) {
                temp[k++] = nums[left];
                left++;
            } else {
                temp[k++] = nums[right];
                right++;
            }
        }
        while (left <= mid) {
            temp[k++] = nums[left];
            left++;
        }
        while (right <= end) {
            temp[k++] = nums[right];
            right++;
        }
        for (int i = 0; i < temp.length; i++) {
            nums[start + i] = temp[i];
        }
        return count;
    }
}
