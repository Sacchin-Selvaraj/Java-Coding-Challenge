package Arrays;

public class MaximumProductSubArray {

    public static void main(String[] args) {

        int[] nums={3,2,0,3,6,0};
        System.out.println(findMaximumProduct(nums));
    }

    private static int findMaximumProduct(int[] nums) {

        int prefixProduct=1;
        int suffixProduct=1;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            if (prefixProduct==0)prefixProduct=1;
            if (suffixProduct==0)suffixProduct=1;
            prefixProduct=prefixProduct*nums[i];
            suffixProduct=suffixProduct*nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(prefixProduct,suffixProduct));
        }
        return ans;
    }
}
