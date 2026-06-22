package Recursion;

public class ValidSubarray {
    static int count=0;
    public static void main(String[] args) {
        ValidSubarray obj = new ValidSubarray();
        int[] nums = {1,100,1};
        int x = 1;
        System.out.println(obj.countValidSubarrays(nums,x));
    }

    public int countValidSubarrays(int[] nums, int x) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                if (isValid(sum, x)) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isValid(int num, int x) {

        int lastDigit = num % 10;

        while (num >= 10) {
            num /= 10;
        }

        int firstDigit = num;

        return firstDigit == x && lastDigit == x;
    }
}
