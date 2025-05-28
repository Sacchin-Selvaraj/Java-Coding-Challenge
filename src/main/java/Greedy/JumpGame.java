package Greedy;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        if (nums.length==1)
            return true;
        int maxIndex=0;
        for (int i = 0; i < nums.length; i++) {
            int tempIndex=i+nums[i];
            maxIndex=Math.max(maxIndex,tempIndex);
            if (i>=maxIndex && i!=nums.length-1)
                return false;

        }
        return true;
    }

    public static void main(String[] args) {
        int[] jump={2,0,0};
        System.out.println(canJump(jump));
    }
}
