package Java_Program;

import java.util.HashMap;

public class NoOfGoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int ans=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int friend=map.getOrDefault(nums[i],0);
            ans+=friend;
            map.put(nums[i],friend+1);

        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,2};
        System.out.println(numIdenticalPairs(nums));
    }
}
