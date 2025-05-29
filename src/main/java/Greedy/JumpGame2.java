package Greedy;

public class JumpGame2 {

    public static int jumps(int[] nums) {

        return recursiveJump(nums, 0);
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
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jumps(nums));
        //System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {

        int left = 0, right = 0, jumps = 0;
        while (right < nums.length - 1) {
            int farthest = 0;
            for (int i = left; i <= right; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            left = right + 1;
            right = farthest;
            jumps++;
        }
        return jumps;
    }

}
