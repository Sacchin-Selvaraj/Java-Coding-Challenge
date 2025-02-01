package DSA;

public class KadaneAlgo {

    public static int maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE,count=0,start=0,end=0;
        int actualStart=0;
        for (int i = 0; i < nums.length; i++) {
            if (sum==0)
                start=i;
            sum=sum+nums[i];
            if(sum<0) {
                sum = 0;
                count++;
            }
            if(sum>max) {
                max = sum;
                actualStart=start;
                end=i;
            }
        }
        System.out.println("Start:"+actualStart+"  End:"+end);
        return count==nums.length?-1:max;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
