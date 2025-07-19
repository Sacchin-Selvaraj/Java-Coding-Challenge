package Contest;

public class SplitArrayByPrime {

    public static long splitArray(int[] nums) {
        long sumA=0;
        long sumB=0;
        for (int i = 0; i < nums.length; i++) {
            if (checkPrimeNumber(i)){
                sumA+=nums[i];
            }else
                sumB+=nums[i];
        }
        return Math.abs(sumA-sumB);
    }

    private static boolean checkPrimeNumber(int i) {
        if (i <= 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i % 2 == 0 || i % 3 == 0) {
            return false;
        }
        for (int j = 5; j * j <= i; j += 6) {
            if (i % j == 0 || i % (j + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums={2,3,4};
        System.out.println(splitArray(nums));
    }
}
