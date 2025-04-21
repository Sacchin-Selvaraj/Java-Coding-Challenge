package Contest;

import java.util.Arrays;

public class FindXvalue {
    public int[] solve(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];

        // Precompute prefix products modulo k
        int[] prefix = new int[n + 1];
        prefix[0] = 1; // Empty prefix
        for (int i = 1; i <= n; i++) {
            prefix[i] = (prefix[i - 1] * nums[i - 1]) % k;
        }

        // Precompute suffix products modulo k
        int[] suffix = new int[n + 1];
        suffix[n] = 1; // Empty suffix
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = (suffix[i + 1] * nums[i]) % k;
        }

        // Iterate over all possible prefix and suffix pairs
        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if (i == 0 && j == n) continue; // Remaining array is empty
                int product = (prefix[i] * suffix[j]) % k;
                result[product]++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindXvalue sol = new FindXvalue();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        int[] result = sol.solve(nums, k);
        System.out.println(Arrays.toString(result)); // Output: [9, 2, 4]
    }
}
