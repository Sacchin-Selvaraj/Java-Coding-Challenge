package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationII {

    public static void main(String[] args) {
        int[] num={1,1,2};
        System.out.println(findPermutations(num));
    }

    private static List<List<Integer>> findPermutations(int[] num) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        boolean[] flag=new boolean[num.length];
        permutate(list,0,num, list1,flag);
        return list;
    }

    private static void permutate(List<List<Integer>> list, int idx, int[] num,List<Integer> list1,boolean[] flag) {
        if (list1.size()==num.length){
            list.add(new ArrayList<>(list1));
            return;
        }
        for (int i = 0; i < num.length; i++) {
            if (flag[i])
                continue;
            if (i>0 && !flag[i-1] && num[i]==num[i-1])
                continue;
            list1.add(num[i]);
            flag[i]=true;
            permutate(list,idx,num,list1,flag);
            list1.remove(list1.size()-1);
            flag[i]=false;
        }
    }
}
