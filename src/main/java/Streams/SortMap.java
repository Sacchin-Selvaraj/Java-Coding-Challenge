package Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

    public static void main(String[] args) {

        Map<String,Integer> map=Map.of("Sacchin",24,"James",25,"Ashwin",26,"Dhoni",34);

        Map<String,Integer> sortedMap=map.entrySet().stream().sorted((o1, o2) -> o2.getValue()- o1.getValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(integer, integer2) -> integer, LinkedHashMap::new));

        System.out.println(sortedMap);
    }
}
