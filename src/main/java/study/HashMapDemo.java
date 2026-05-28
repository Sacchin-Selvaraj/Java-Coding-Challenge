package study;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static String string="sac";
    public static void main(String[] args) {

        String str = "addeebcccha";// b

        Optional<Character> firstNonRepeating = str.chars()
                 .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(firstNonRepeating.orElse('a'));

    }
}
