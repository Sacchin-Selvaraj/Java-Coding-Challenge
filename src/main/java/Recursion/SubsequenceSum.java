package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSum {
    static int[] arr={3,1,2,1};
    static int targetSum=3;
    public static void main(String[] args) {
        int sum=0;
        List<Integer> list=new ArrayList<>();
        subsequence(0,list,arr.length,sum);
    }
    private static void subsequence(int idx, List<Integer> list, int length,int sum) {
        if (idx>=length){
            if (sum==targetSum)
                System.out.println(list);
            return;
        }
        list.add(arr[idx]);
        sum+=arr[idx];
        subsequence(idx+1,list,length,sum);
        Object num=arr[idx];
        sum-=arr[idx];
        list.remove(num);
        subsequence(idx+1,list,length,sum);
    }
}
