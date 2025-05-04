package Scalar;

import java.util.Arrays;

public class pickFromBothSides {
    public static int solve(int[] A, int B) {
        int len = A.length;
        int[] prefixSum = new int[A.length];
        int[] suffixSum = new int[A.length];
        prefixSum[0] = A[0];
        for (int i = 1; i < len; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }
        suffixSum[len-1]=A[len-1];
        for (int i = len - 2; i >= 0; i--) {
            suffixSum[i]=suffixSum[i+1]+A[i];
        }
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(Arrays.toString(suffixSum));

        int ans=Math.max(prefixSum[B-1],suffixSum[len-B]);
        for (int i = 1; i < B; i++) {
            int sum = prefixSum[i-1]+suffixSum[len-B];
            ans=Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 4, 2, 1};
        System.out.println(solve(nums, 4));
    }
}
