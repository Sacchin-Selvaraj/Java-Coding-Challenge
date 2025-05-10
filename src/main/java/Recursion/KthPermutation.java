package Recursion;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {

    public static void main(String[] args) {

        int n = 3;
        int k = 4;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] num = {1, 2, 3};
        findNthPermutation(res, list, num, 0);
        int result=findNthPermutations(n,k,num);
        System.out.println(res);
    }

    private static int findNthPermutations(int n, int k, int[] num) {

        int totalPermutation=6;
        int singlePermutation=6/2;
        List<Integer> list=new ArrayList<>();
        while (k/singlePermutation>=0){
            k=k/singlePermutation;
            list.add(num[k]);
        }

        return 1;
    }

    private static void findNthPermutation(List<List<Integer>> res, List<Integer> list, int[] num, int idx) {

        if (idx == num.length-1) {
            List<Integer>list1=new ArrayList<>();
            for (int nums : num) {
                list1.add(nums);
            }
            res.add(new ArrayList<>(list1));
            return;
        }
        for (int i = idx; i < num.length; i++) {
            swapNum(num, i, idx);
            findNthPermutation(res, list, num, idx + 1);
            swapNum(num, i, idx);
        }

    }

    private static void swapNum(int[] num, int i, int idx) {
        int temp = num[i];
        num[i] = num[idx];
        num[idx] = temp;
    }
}
