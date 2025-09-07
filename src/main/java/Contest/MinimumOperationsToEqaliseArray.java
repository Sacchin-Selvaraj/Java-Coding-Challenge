package Contest;

public class MinimumOperationsToEqaliseArray {

    public static void main(String[] args) {
       int[] nums={1,2};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int res=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(res!=nums[i]){
                return 1;
            }
        }
        return 0;
    }
}
