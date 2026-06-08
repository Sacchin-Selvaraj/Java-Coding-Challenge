package CommonQuestions;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {10,2};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        int i=0;
        for(int num:nums){
            arr[i]=num;
            i++;
        }

        Arrays.sort(arr,(a, b)-> Integer.compare(a+b,b+a));

        StringBuilder str = new StringBuilder();
        for(int num:arr){
            str.append(String.valueOf(num));
        }

        return str.toString();
    }
}
