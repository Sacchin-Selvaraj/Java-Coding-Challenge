package Arrays;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] num={4,3,6,2,1,1};
        System.out.println(Arrays.toString(findMissingNumberAndRepeatedNumber(num)));
    }

    private static long[] findMissingNumberAndRepeatedNumber(int[] num) {
        int len= num.length;
        int s1=0,s2=0;
        long sum1= (long) len *(len+1)/2;
        long sum2=len*(len+1)*(2*len+1)/6;
        for (int i = 0; i < len; i++) {
            s1+=num[i];
            s2+=num[i]*num[i];
        }
        long eq1=sum1-s1;
        long eq2=sum2-s2;
        long val1=eq2/eq1;
        val1=(val1-eq1)/2;

        long y= (eq1+val1);
        return new long[]{val1,y};


    }
}
