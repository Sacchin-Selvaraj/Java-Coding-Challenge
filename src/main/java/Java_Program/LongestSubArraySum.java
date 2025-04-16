package Java_Program;

public class LongestSubArraySum {

    private static int findLongestSubArray(int[] nums,int k) {

        int left=0,right=0;
        int n=nums.length;
        int sum=0;
        int maxLen=0;
        while (right<n){
            sum=sum+nums[right];
            while (left<=right && sum > k){
                sum-=nums[left];
                left++;
            }
            if (sum==k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,1,2,3};
        System.out.println(findLongestSubArray(nums,3));
    }
}
