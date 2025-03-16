package Contest;

import java.util.Arrays;
import java.util.stream.Stream;

public class ZeroArray {
    public static int minZeroArray(int[] nums, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int[] temp=queries[i];
            int idx1=temp[0];
            int idx2=temp[1];
            int dec=temp[2];
            if (nums[idx1]!=0)
                nums[idx1]=nums[idx1]-dec;
            if (nums[idx2]!=0)
                nums[idx2]=nums[idx2]-dec;
            if (calculateSum(nums)==0)
                return i+1;
        }
        return -1;
    }

    private static int calculateSum(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,2,6};
        int[][] queries={{0,1,1},{0,2,1},{1,4,2},{4,4,4},{3,4,1},{4,4,5}};
        System.out.println(minZeroArray(nums,queries));
    }
}
