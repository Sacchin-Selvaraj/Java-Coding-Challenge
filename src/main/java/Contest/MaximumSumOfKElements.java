package Contest;

import java.util.*;

public class MaximumSumOfKElements {
    public static long[] findMaxSum(int[] nums1, int[] nums2, int k) {

        long[] res=new long[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for (int num:nums2){
            map.put(i++,num);
        }
        for (int j = 0; j < nums1.length; j++) {
            List<Integer> list=new ArrayList<>();
            long num=0;
            for (int l = 0; l < nums1.length; l++) {
                if (nums1[l]<nums1[j]){
                    list.add(l);
                }
            }
            num=calculateMaxHeap(list,k,map);
            res[j]=num;
        }
        return res;

    }

    private static long calculateMaxHeap(List<Integer> list,int k, HashMap<Integer, Integer> map) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int sum=0;
        if (list.isEmpty())
            return 0;
        if (list.size()<k){
           for (int num:list){
              sum=sum+map.get(num);
           }
           return sum;
        }
        for (int i = 0; i < k; i++) {
            queue.add(map.get(list.get(i)));
        }
        for (int i = k; i < list.size() ; i++) {
            queue.add(map.get(list.get(i)));
            if (queue.size()>k){
                queue.poll();
            }
        }

        while (!queue.isEmpty()){
            sum=sum+queue.poll();
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums1={4,2,1,5,3};
        int[] nums2={10,20,30,40,50};
        int k=2;
        System.out.println(Arrays.toString(findMaxSum(nums1,nums2,k)));
    }
}
