package Java_Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        int i=0;
        HashMap<Integer,Integer> FrequencyMap=new HashMap<>();
        for (int n:nums){
            FrequencyMap.put(n,FrequencyMap.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>(
                (a,b) -> a.getValue()-b.getValue()
        );

        for (Map.Entry<Integer,Integer> entry:FrequencyMap.entrySet()){
            minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        System.out.println(minHeap.size());

       int[] result=new int[minHeap.size()];
       while (!minHeap.isEmpty()){
           result[i++]=minHeap.poll().getKey();
       }

        return result;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,3};
        int k=2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
