package Streams;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str="SacchinS";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        str.chars().mapToObj(c->(char)c)
                .forEach(character -> map.put(character,map.getOrDefault(character,0)+1));

        Character nonRepeatedCharacter=map.entrySet().stream().filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey).findFirst().orElse('q');
        System.out.println(nonRepeatedCharacter);
    }
}


