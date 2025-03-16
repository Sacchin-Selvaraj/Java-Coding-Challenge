package Contest;

import java.util.ArrayList;
import java.util.List;

public class CloseEqualElements {
    public static List<Integer> solveQueries(int[] nums, int[] queries) {

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int num=calculateElements(nums,queries[i]);
            list.add(num);
        }
        return list;
    }

    private static int calculateElements(int[] nums, int query) {
        int Min=Integer.MAX_VALUE;
        int n=nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==nums[query]&&i!=query){
                int forward = (i - query + n) % n; // Forward distance
                int backward = (query - i + n) % n; // Backward distance
                int distance = Math.min(forward, backward);
                Min = Math.min(Min, distance);
            }
        }

        return (Min==Integer.MAX_VALUE)?-1:Min;
    }

    public static void main(String[] args) {
        int[] nums={1,3,1,4,1,3,2};
        int[] queries={0,3,5};
        System.out.println(solveQueries(nums,queries));
    }
}
