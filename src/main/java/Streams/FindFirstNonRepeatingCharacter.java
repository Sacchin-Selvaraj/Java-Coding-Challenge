package Streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str="Knowledge";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        str.chars().mapToObj(c->(char)c)
                .forEach(character -> map.put(character,map.getOrDefault(character,0)+1));

        Character nonRepeatedCharacter=map.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey).findFirst().orElse(' ');

        System.out.println(nonRepeatedCharacter);


       Character nonRepeating=str.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting())).entrySet()
                        .stream().filter(characterLongEntry -> characterLongEntry.getValue()==1)
                        .map(Map.Entry::getKey).findFirst().get();

        System.out.println(nonRepeating);
    }
}


