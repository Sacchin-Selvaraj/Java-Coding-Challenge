package Java_Program;

import java.util.Arrays;

public class SeperateZeros {

    private static int[] findSeprateArray(int[] nums) {

        int left=0,right = nums.length-1;
        while (left<right){
            while (nums[left]==0){
                left++;
            }
            while (nums[right]==1){
                right--;
            }
            if (left<right)
                swapNumbers(left,right,nums);
        }
        return nums;
    }

    private static void swapNumbers(int left, int right, int[] nums) {
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }

    public static void main(String[] args) {

        int[] nums={1,0,0,1,0,0,1,1,0};

        System.out.println(Arrays.toString(findSeprateArray(nums)));

    }
}
