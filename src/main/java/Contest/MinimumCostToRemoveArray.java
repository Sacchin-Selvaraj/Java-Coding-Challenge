package Contest;

import java.util.*;

public class MinimumCostToRemoveArray {

    public static int minCost(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for (int num:nums){
            map.put(i++,num);
        }

        int max=Integer.MIN_VALUE;
        while (!map.isEmpty()){
            if (map.size()>2){
                for (int j = 0; j < 3; j++) {

                    map.get(0);
                }

            }


        }

        System.out.println(map);
        return 0;

    }

    public static void main(String[] args) {
        int[] nums={6,2,8,4};
        System.out.println(minCost(nums));
    }
}
