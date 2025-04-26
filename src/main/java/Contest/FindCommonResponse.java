package Contest;

import java.util.*;

public class FindCommonResponse {
    public static String findCommonResponse(List<List<String>> responses) {
        TreeMap<String,Integer> map=new TreeMap<>();
        for (List<String> list:responses){
            HashSet<String> set = new HashSet<>(list);
            for (String s:set){
                map.put(s,map.getOrDefault(s,0)+1);
            }

        }
        String s=map.entrySet().stream()
                .max(
                        // First compare by value (descending), then by key (ascending)
                        Comparator.comparingInt(Map.Entry<String, Integer>::getValue)
                                .thenComparing(Map.Entry::getKey, Comparator.reverseOrder())
                )
                .map(Map.Entry::getKey)
                .orElse(null);

        return s;
    }

    public static void main(String[] args) {
        List<List<String>> list=List.of(List.of("good","ok","good","ok"),
                List.of("ok","bad","ok","ok"),
                List.of("good"),
                List.of("bad"));
        System.out.println(findCommonResponse(list));

    }
}
