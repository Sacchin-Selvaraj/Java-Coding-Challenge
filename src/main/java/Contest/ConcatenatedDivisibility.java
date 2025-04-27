package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ConcatenatedDivisibility {

    public static int[] concatenatedDivisibility(int[] nums, int k) {
        List<List<Integer>> list=new ArrayList<>();
        findPermutation2(nums,k,0,list);
        return nums;

    }

    private static void findPermutation2(int[] nums, int k, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(currentPermutation);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            findPermutation2(nums, k,index + 1, result);
            swap(nums, index, i); // backtrack
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



    public static void main(String[] args) {
        int[] nums={3,12,45};
        int k=5;
        System.out.println(Arrays.toString(concatenatedDivisibility(nums,k)));
    }
}
