package Greedy;

public class JumpGame2 {

    public static int jump(int[] nums) {

        return recursiveJump(nums,0);
    }

    private static int recursiveJump(int[] nums, int idx) {
        if (idx >= nums.length - 1) {
            return 0;
        }
        int minJumps = Integer.MAX_VALUE;

        for (int j = 1; j <= nums[idx]; j++) {
            int nextIdx = idx + j;
            if (nextIdx < nums.length) {
                int jumps = recursiveJump(nums, nextIdx);
                if (jumps != Integer.MAX_VALUE) {
                    minJumps = Math.min(minJumps, 1 + jumps);
                }
            }
        }

        return minJumps;
    }

    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
