package Contest;

public class CountNoOfComputersUnlocking {

    public static int countPermutations(int[] complexity) {
        int[] nums=new int[complexity.length];
        for (int i = 0; i < complexity.length; i++) {
            nums[i]=i;
        }
        return unlockingComputers(complexity,nums,0,0);
    }

    private static int unlockingComputers(int[] complexity,int[] nums, int idx, int unlockedComputers) {

        if (idx==nums.length-1){
            if (isValidComplexity(complexity,nums)) {
                System.out.println("valid...");
                return 1;
            }
            else return 0;
        }
        for (int i = idx; i < nums.length; i++) {
            swaps(nums,i,idx);
            unlockedComputers+=unlockingComputers(complexity,nums,idx+1,unlockedComputers);
            swaps(nums,i,idx);
        }
        return unlockedComputers;
    }

    private static boolean isValidComplexity(int[] complexity,int[] nums) {
        for (int i = 1; i < complexity.length; i++) {
            if (complexity[nums[i-1]]>=complexity[nums[i]]){
                return false;
            }
        }
        return true;
    }

    private static void swaps(int[] nums, int i, int idx) {
        int num=nums[i];
        nums[i]=nums[idx];
        nums[idx]=num;
    }

    public static void main(String[] args) {
        int[] complexity={1,2,3};
        System.out.println(countPermutations(complexity));
    }
}
