package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    static int[] arr={3,1,2};
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        subsequence(0,list,arr.length);
    }

    private static void subsequence(int idx, List<Integer> list, int length) {
        if (idx>=length){
            System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        subsequence(idx+1,list,length);
        Object num=arr[idx];
        list.remove(num);
        subsequence(idx+1,list,length);
    }
}
