package Java_Program;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    private static int[] findTwoSum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num=k-nums[i];
            if (!map.isEmpty() && map.containsKey(num)){
                return new int[]{i,map.get(num)};
            }
            map.put(nums[i],i);
        }
        return new int[]{ };
    }
    public static void main(String[] args) {

        int[] nums={2,6,5,8,11};
        int k=8;
        System.out.println(Arrays.toString(findTwoSum(nums, k)));
    }


}
