package Java_Program;

import java.util.Arrays;

public class MajorityElements {

    private static int findMajority(int[] nums) {

        Arrays.sort(nums);
        int max=0;
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]==nums[i]){
                count++;
            }else {
                max=Math.max(max,count);
                count=0;
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        int[] nums={2,2,3,3,1,2,2,2}; //[1,2,2,2,2,3,3]
        System.out.println(findMajority(nums));
    }


}
