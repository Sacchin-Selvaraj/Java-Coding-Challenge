package Java_Program;

import java.util.*;

public class TopKFrequentWords {


    public static List<String> topKFrequent(String[] words, int k) {

        int i=0;
        HashMap<String ,Integer> map=new HashMap<>();
        for (String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);

        PriorityQueue<Map.Entry<String,Integer>> heap=new PriorityQueue<>( (a, b) -> a.getValue() == b.getValue()
                ? a.getKey().compareTo(b.getKey()) // Sort alphabetically if frequencies are the same
                : a.getValue() - b.getValue()
        );

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }
        List<String> res=new ArrayList<>();
        while (!heap.isEmpty()){
            res.add(heap.poll().getKey());
        }
        Collections.reverse(res);

        return res;

    }
    public static void main(String[] args) {

        String [] words={"i","love","leetcode","i","love","coding"};
        int k=2;
        System.out.println(topKFrequent(words,k));
    }
}
