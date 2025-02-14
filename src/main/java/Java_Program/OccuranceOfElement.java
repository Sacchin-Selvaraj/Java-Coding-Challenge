package Java_Program;

import java.util.Arrays;
import java.util.HashMap;

public class OccuranceOfElement {
    public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {

        int[] res=new int[queries.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int j:nums){
            map.put(j,map.getOrDefault(j,0)+1);
        }
        int freq=map.getOrDefault(x,-1);
        for (int i = 0; i < queries.length; i++) {
            if (queries[i]<=freq){
                res[i]=queries[i];
            }else
                res[i]=-1;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums={1,3,1,7};
        int[] queries={1,3,2,4};
        int x=1;

        System.out.println(Arrays.toString(occurrencesOfElement(nums,queries,x)));
    }
}
