package Contest;

import java.util.HashSet;
import java.util.Set;

public class NumberOfUniqueXOR {
    private static Set<Integer> uniqueXORs = new HashSet<>();

    public static int uniqueXorTriplets(int[] nums) {
        generateTriplets(nums, 0, 0, 0, 0);
        return uniqueXORs.size();
    }

    private static void generateTriplets(int[] nums, int index, int count, int currentXOR, int start) {
        if (count == 3) {
            uniqueXORs.add(currentXOR);
            return;
        }

        if (index >= nums.length) {
            return;
        }
        // Include the current element (with i <= j <= k constraint)
        for (int i = start; i < nums.length; i++) {
            generateTriplets(nums, index + 1, count + 1, currentXOR ^ nums[i], i);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2};
        System.out.println(uniqueXorTriplets(nums));
    }
}
