package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfNumber {

    public static void main(String[] args) {
        int[] num={1,2,3};
        System.out.println(findPermutations(num));
    }

    private static List<List<Integer>> findPermutations(int[] num) {
        List<List<Integer>> list=new ArrayList<>();
        permutate(list,0,num);
        return list;
    }
    private static void permutate(List<List<Integer>> list, int currentIdx, int[] num) {
        if (currentIdx==num.length-1){
            List<Integer> list1=new ArrayList<>();
            for (int nums:num){
                list1.add(nums);
            }
            list.add(list1);
            return;
        }
        for (int i = currentIdx; i < num.length; i++) {
            swap(num,currentIdx,i);
            permutate(list,currentIdx+1,num);
            swap(num,currentIdx,i);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
