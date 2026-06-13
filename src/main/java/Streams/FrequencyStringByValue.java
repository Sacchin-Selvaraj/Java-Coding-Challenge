package Streams;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FrequencyStringByValue {
    public static void main(String[] args) {

        String str = "java is a good coding language";

        Map<Character,Long> freqMap = str.chars()
                .mapToObj(c->(char)c)
                .filter(c-> c !=' ')
                .collect(Collectors.groupingBy(c->c,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character,Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.<Character,Long>comparingByKey().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (e, r)->e, LinkedHashMap::new
                ));

        System.out.println(freqMap);

        Optional<Character> nonRepeating = Optional.empty();

        System.out.println(nonRepeating);
    }
}
