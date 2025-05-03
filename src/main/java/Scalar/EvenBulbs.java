package Scalar;

public class EvenBulbs {
    public static int bulbs(int[] A) {

        int count = 0;
        for (int i = 0; i < A.length; i++) {

            if (count % 2 == 1) A[i] = 1 - A[i];

            if (A[i] == 1) continue;

            if (A[i] == 0) count++;

        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 0, 1};
        System.out.println(bulbs(nums));
    }
}
