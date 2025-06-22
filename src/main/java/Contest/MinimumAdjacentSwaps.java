package Contest;


public class MinimumAdjacentSwaps {

    public static int minSwaps(int[] nums) {
       int evenSwaps=0,oddSwaps=0;
       if (nums[0]%2==0){
           evenSwaps+=findSwaps(nums);
       }else {
           for (int i = 1; i < nums.length; i++) {
               if (nums[i]%2==1){
                   int temp=nums[0];
                   nums[0]=nums[i];
                   nums[i]=temp;
               }
           }
           oddSwaps+=findSwaps(nums);
       }
       if (oddSwaps==-1){
           return evenSwaps;
       }else if (evenSwaps==-1){
           return oddSwaps;
       }else {
           return Math.min(evenSwaps,oddSwaps);
       }
    }
    private static int findSwaps(int[] nums) {
        int swaps=0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i-1]+nums[i])%2==0) {
                int num=nums[i]%2;
                for (int j = i+1; j < nums.length; j++) {
                    int point=nums[j]%2;
                    if (num!=point){
                        swaps++;
                        doSwap(nums,j);
                        i=0;
                        break;
                    }
                }
            }
        }
        for (int i = 1; i <nums.length ; i++) {
            if ((nums[i]+nums[i-1])%2==0){
                return -1;
            }
        }
        return swaps;
    }

    private static void doSwap(int[] nums, int j) {
        int temp=nums[j];
        nums[j]=nums[j-1];
        nums[j-1]=temp;
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,8};
        System.out.println(minSwaps(nums));
    }
}
