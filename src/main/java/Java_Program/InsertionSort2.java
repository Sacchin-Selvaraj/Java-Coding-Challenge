package Java_Program;

import java.util.Arrays;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] nums = {9, 3, 4, 1, 6, 5};
        System.out.println(Arrays.toString(insertionSort(nums, nums.length)));
    }

    private static int[] insertionSort(int[] nums, int length) {
        for (int i = 1; i < length; i++) {
            int temp = nums[i];
            int j = i-1;
            while (j >= 0 && nums[j] > temp) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]=temp;
        }
        return nums;
    }
}
