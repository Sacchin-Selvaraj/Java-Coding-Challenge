package Contest;

public class SmallestIndex {

    public static int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (i==sumOfDigits(nums[i])){
                return i;
            }
        }
        return -1;
    }

    private static int sumOfDigits(int num) {
        int sum=0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
       int[] nums={1,1000};
        System.out.println(smallestIndex(nums));
    }
}
