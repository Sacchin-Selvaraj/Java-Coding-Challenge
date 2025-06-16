package Contest;

public class ProductOfFristAndSecond {

    public static long maximumProduct(int[] nums, int m) {
        int maxNumber=Integer.MIN_VALUE,minNumber=Integer.MAX_VALUE;
        long res=1L * nums[0] * nums[m - 1];
        for (int i = m-1; i <nums.length ; i++) {
            int num=nums[i];
            maxNumber=Math.max(maxNumber,nums[i-m+1]);
            minNumber=Math.min(minNumber,nums[i-m+1]);
            res=Math.max(res,Math.max(maxNumber*num,minNumber*num));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums={2,-1,2,-6,5,2,-5,7};
        int m=2;
        System.out.println(maximumProduct(nums,m));
    }
}
