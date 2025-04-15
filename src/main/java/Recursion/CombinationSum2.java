package Recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinationSum(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private static void findCombinationSum(List<List<Integer>> list, List<Integer> temp, int[] candidates, int target, int idx) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (i>idx && candidates[i]==candidates[i-1])
                continue;
            if (candidates[i]>target)
                break;
            temp.add(candidates[i]);
            findCombinationSum(list, temp, candidates, target - candidates[i], i + 1);
            temp.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 5, 2, 1, 2}; // [1,2,2,2,5]
        int target = 5;
        System.out.println(combinationSum2(candidates, target));
    }
}
