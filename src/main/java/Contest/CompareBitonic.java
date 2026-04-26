package Contest;

import java.math.BigInteger;
import java.util.Arrays;

public class CompareBitonic {
    public static void main(String[] args) {
        int[] nums={30494606,875031872,850559628,844602130};
        System.out.println(compareBitonicSums(nums));
    }

    public static int compareBitonicSums(int[] nums) {

//        int peakSum=0;
//        int descend=0;
//
//        int sum = Arrays.stream(nums).sum();
//
//        for(int i=0;i<nums.length;i++){
//            if(i==nums.length-1) break;
//            if(nums[i+1]>nums[i]){
//                peakSum+=nums[i];
//            }else{
//                peakSum+=nums[i];
//                descend+=nums[i];
//                break;
//            }
//        }
//
//        descend+=sum-peakSum;
//        if(peakSum==descend) return -1;
//
//        return peakSum>descend?0:1;


        long peakSum = 0;
        long descend = 0;

        long sum = 0;
        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {

            if (i == nums.length - 1) break;

            if (nums[i + 1] > nums[i]) {
                peakSum += nums[i];
            } else {
                peakSum += nums[i];
                descend += nums[i];
                break;
            }
        }

        descend += sum - peakSum;

        if (peakSum == descend) return -1;

        return peakSum > descend ? 0 : 1;

    }
}
