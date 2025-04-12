package Contest;

import java.util.Arrays;

public class MinimumOperations {
    public static int minOperations(int[] nums, int k) {
//        int sum = Arrays.stream(nums).sum();
//        int count=0;
//        for (int i = 0; i < sum; i++) {
//            if (sum%k==0)
//                return count;
//            sum--;
//            count++;
//        }
//        return count;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Find the remainder when sum is divided by k
        int remainder = sum % k;

        // If remainder is 0, sum is already divisible by k
        if (remainder == 0) {
            return 0;
        }

        // We need to decrease by remainder to reach the previous multiple of k
        return remainder;

    }

    public static void main(String[] args) {
        int[] nums={3,2};
        System.out.println(minOperations(nums,6));
    }
}
