package TwoPointer_SlidingWindow;

public class MaxConsecutiveOnes_I {
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length==1){
            return nums[0]==0?-1:1;
        }
        int left=0,right=0,maxLen=-1,len=0;
        while (right < nums.length){
            if (nums[right]==0){
                left=right+1;
            }
            len=right-left+1;
            maxLen=Math.max(maxLen,len);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
