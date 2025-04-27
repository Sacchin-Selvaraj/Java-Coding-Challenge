package Arrays;

import java.util.HashMap;

public class NoOfSubarraySumsK {

    public static void main(String[] args) {
        int[] nums={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;

        System.out.println(findSubarray(nums,k));
    }

    private static int findSubarray(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int prefixSum=0;
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            prefixSum+=nums[i];
            int num=prefixSum-k;
           if (map.containsKey(num)){
                count+=map.get(num);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
