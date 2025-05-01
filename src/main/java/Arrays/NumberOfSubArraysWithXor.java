package Arrays;

import java.util.HashMap;

public class NumberOfSubArraysWithXor {

    public static void main(String[] args) {
        int[] nums={4,2,2,6,4};
        int num=6;
        System.out.println(findSubarrays(nums,num));
    }

    private static int findSubarrays(int[] nums, int num) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int xor=0,count=0;
        for (int i = 0; i < nums.length; i++) {
            xor=xor^nums[i];
            int x=num^xor;
            if (map.containsKey(x)) {
                count=count+map.get(x);
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return count;
    }
}
