package TwoPointer_SlidingWindow;

public class BinarySubArraysWithSum {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return calculateSubarraySum(nums,goal)-calculateSubarraySum(nums,goal-1);
    }

    private static int calculateSubarraySum(int[] nums, int goal) {
        if (goal<0) return 0;
        int left=0,right=0,count=0,n=nums.length,sum=0;
        while (right<n){
            sum+=nums[right];
            while (sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=(right-left+1);
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={0,0,0,0,0};
        int goal=0;
        System.out.println(numSubarraysWithSum(arr,goal));
    }
}
