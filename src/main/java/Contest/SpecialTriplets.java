package Contest;

import java.util.HashMap;

public class SpecialTriplets {

    public static int specialTriplets(int[] nums) {
        HashMap<Integer,Integer> rightMap=new HashMap<>();
        HashMap<Integer,Integer> leftMap=new HashMap<>();
        long triplets=0;
        for (int i = 0; i < nums.length; i++) {
            rightMap.put(nums[i],rightMap.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0; i < nums.length; i++) {
            int num=nums[i];
            rightMap.put(num,rightMap.get(num)-1);
            if (rightMap.containsKey(num*2) && leftMap.containsKey(num*2)){
                triplets=(triplets+1L*leftMap.get(num*2)*rightMap.get(num*2)) % 1_000_000_007;
            }
            leftMap.put(num,leftMap.getOrDefault(num,0)+1);
        }
        return (int) triplets;
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,0};
        System.out.println(specialTriplets(nums));
    }
}
