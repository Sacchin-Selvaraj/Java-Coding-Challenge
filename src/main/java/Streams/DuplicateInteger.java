package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateInteger {

    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(1,2,3,4,5,2,3,6,7,4,8,9);

        List<Integer> sumMap=list.stream()
                .collect(Collectors.groupingBy(n-> n,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        Integer largest = list.stream().max(Comparator.naturalOrder()).orElseGet(() -> 0);
        System.out.println(largest);

        System.out.println(sumMap);
    }
}
