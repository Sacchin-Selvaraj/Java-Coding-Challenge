package Contest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumDeletions {

    public static int minDeletion(String s, int k) {
        int count=0,kth=0;
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer> sortedMap=map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(integer, integer2) -> integer, LinkedHashMap::new));
        kth=sortedMap.size()-k;
        for (Map.Entry<Character, Integer> entry:sortedMap.entrySet()){
            if (kth<=0)break;
            kth--;
            count+=entry.getValue();
        }
        return count;
    }

    public static void main(String[] args) {
        String s="uxyhf";
        System.out.println(minDeletion(s,7));
    }
}
