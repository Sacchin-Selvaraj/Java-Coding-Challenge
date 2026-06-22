package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class Top2MostFrequentWords {
    public static void main(String[] args) {
        String[] words = {"Hi","Hello","Hi","Hello","Sachin","Hi","Hello","world","Hi","Java","Coding","world"};

        Map<String,Long> map = Arrays.stream(words).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(map);

        Map<String,Long> sortedMap = map.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e,r)-> e, LinkedHashMap::new));

        System.out.println(sortedMap);

        PriorityQueue<Map.Entry<String,Long>> queue = new PriorityQueue<>((a, b)->
                Math.toIntExact(a.getValue() - b.getValue())
                );
        for (Map.Entry<String,Long> entry : map.entrySet()){
            queue.add(entry);
            if (queue.size()>2){
                queue.poll();
            }
        }

        queue.forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
    }
}
