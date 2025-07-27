package Contest;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumNumberOfSequence {
    public static long numOfSubsequences(String s) {
        int smallerElement=Integer.MAX_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='L' || s.charAt(i)=='C' || s.charAt(i)=='T'){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
       if (map.size()<=1)
           return 0;

        long ans=1;
        PriorityQueue<Integer> queue=new PriorityQueue<>(map.values());

       if (map.size()==2){
           while (!queue.isEmpty()){
               ans*=queue.poll();
           }
           return ans;
       }

        smallerElement= queue.poll();
        smallerElement++;
        ans*=smallerElement;
        while (!queue.isEmpty()){
            ans*=queue.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="LCTKLCLT";
        System.out.println(numOfSubsequences(s));
    }
}
