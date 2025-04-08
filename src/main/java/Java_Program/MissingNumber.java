package Java_Program;

public class MissingNumber {
    public static int findMissingNumber(int[] nums, int n) {
        int xor1 = 0, xor2 = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        // XOR all numbers in the array
        for (int num : nums) {
            xor2 ^= num;
        }

        // The missing number is xor1 ^ xor2
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};  // Missing 3
        int n = 5;
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}
