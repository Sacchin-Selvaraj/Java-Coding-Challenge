package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        findCombinationSum(list,new ArrayList<>(),candidates,target,0);
        return list;
    }

    private static void findCombinationSum(List<List<Integer>> list, List<Integer> temp,int[] candidates, int target, int idx) {
        if (idx == candidates.length){
            if (target==0){
                list.add(new ArrayList<>(temp));
                return;
            }
            return;
        }
        if (candidates[idx]<=target) {
            temp.add(candidates[idx]);
            findCombinationSum(list, temp, candidates, target - candidates[idx], idx);
            Object obj = candidates[idx];
            temp.remove(obj);
        }
        findCombinationSum(list,temp,candidates,target,idx+1);
    }

    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
}
