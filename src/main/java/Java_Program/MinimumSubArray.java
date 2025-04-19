package Java_Program;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubArray {

    private static List<Integer> findMinimumSubArray(int[] nums, int k) {

        int left=0,right=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        ArrayList<Integer> integers=null;
        while (right<nums.length){
            sum=sum+nums[right];
            while (sum > k){
                sum-=nums[left];
                left++;
            }
            if (sum==k){
                int temp=minLen;
                minLen=Math.min(minLen,right-left+1);
                if (temp!=minLen){
                    integers=new ArrayList<>();
                    for (int i = left; i <= right; i++) {
                        integers.add(nums[i]);
                    }
                }
            }
            right++;
        }
        System.out.println(minLen);
        return integers;
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3,7};
        int k=3;
        System.out.println(findMinimumSubArray(nums,k));
    }


}
