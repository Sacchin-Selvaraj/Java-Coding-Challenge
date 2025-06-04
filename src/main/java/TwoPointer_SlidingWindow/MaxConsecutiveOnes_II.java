package TwoPointer_SlidingWindow;

public class MaxConsecutiveOnes_II {

    public static int longestOnes(int[] nums, int k) {
        if (nums.length==1){
            return nums[0]==0?-1:1;
        }
        int left=0,right=0,maxLen=0,len=0,n=nums.length;
        while (right<n){
            while (k==0 && nums[right]==0){
                if (nums[left]==0){
                    k++;
                }
                left++;
            }
            if (nums[right]==0)
                k--;
            len=right-left+1;
            maxLen=Math.max(maxLen,len);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(nums,k));
    }
}
