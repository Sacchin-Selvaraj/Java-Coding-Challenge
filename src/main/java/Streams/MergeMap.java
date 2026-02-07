package Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MergeMap {
    public static void main(String[] args) {

        Map<Character,Integer> map1= Map.of('a',1,'b',2,'c',3,'d',4);

        Map<Character,Integer> map2=Map.of('b', 2,'c',3,'e',4);

        Map<Character,Integer> mergedMap= map1.entrySet().stream()
                .filter(entry-> map2.containsKey(entry.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        o -> o.getValue()+map2.get(o.getKey()),
                        (a,b)-> a,
                        HashMap::new
                ));

        System.out.println(mergedMap);
    }
}
