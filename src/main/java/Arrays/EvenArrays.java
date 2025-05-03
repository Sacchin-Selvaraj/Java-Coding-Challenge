package Arrays;

public class EvenArrays {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 3};
        System.out.println(findEvenSubarrays(nums));
    }

    private static String findEvenSubarrays(int[] A) {
        if (A.length % 2 == 1) return "NO";

        if ((A[0]%2==0) && A[A.length-1]%2==0){
            return "YES";
        }
        return "NO";
    }
}

