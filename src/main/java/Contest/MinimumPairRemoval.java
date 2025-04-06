package Contest;

import java.util.ArrayList;
import java.util.List;

public class MinimumPairRemoval {

    public static int minimumPairRemoval(int[] nums) {

        if (nums.length==1&&nums[0]<=0)
            return 0;
        if (nums.length==1)
            return 0;
        int operations=0;
        List<Integer> list=new ArrayList<>();
        for (int num:nums){
            list.add(num);
        }

        while (!isNonDecresingOrder(list)){
            int minSum=Integer.MAX_VALUE;
            int mergedIdx=-1;
            for (int i = 0; i < list.size()-1; i++) {
                int currentSum=list.get(i)+list.get(i+1);
                if (currentSum<minSum){
                    minSum=currentSum;
                    mergedIdx=i;
                }
            }
            int mergedValue = list.get(mergedIdx) + list.get(mergedIdx + 1);
            list.remove(mergedIdx + 1);
            list.set(mergedIdx, mergedValue);
            operations++;
        }
        return operations;
    }

    private static boolean isNonDecresingOrder(List<Integer> list) {

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i)<list.get(i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums={2,1,2,-1,-1,-2,-2,-1,-1,1,1};
        System.out.println(minimumPairRemoval(nums));

    }
}
