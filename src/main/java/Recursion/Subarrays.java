package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subarrays {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> tempList=new ArrayList<>();
        findSubArray(num,list,tempList,0,num.length);
        System.out.println(list);
    }

    private static void findSubArray(int[] num, List<List<Integer>> list, List<Integer> tempList, int idx, int length) {

        if (idx==length){
            list.add(new ArrayList<>(tempList));
            return;
        }
        tempList.add(num[idx]);
        findSubArray(num,list,tempList,idx+1,length);
        Object obj=num[idx];
        tempList.remove(obj);
        findSubArray(num,list,tempList,idx+1,length);
    }


}
