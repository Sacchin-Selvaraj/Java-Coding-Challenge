package Java_Program;

public class SumOfGoodNumbers {
    public static int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int m = i - k;
            int n = i + k;
            if((m >= 0 && m < nums.length)&&(n >= 0 && n < nums.length)){
                if(nums[i] > nums[m]&&nums[i] > nums[n]){
                    sum += nums[i];
                    continue;
                }
                continue;
            }
            if (m >= 0 && m < nums.length) {
                if (nums[i] > nums[m]) {
                    sum += nums[i];
                    continue;
                }
            }
            if (n >= 0 && n < nums.length) {
                if (nums[i] > nums[n]) {
                    sum += nums[i];
                    continue;
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 5, 4};
        int k = 2;
        System.out.println(sumOfGoodNumbers(nums, k));
    }
}
