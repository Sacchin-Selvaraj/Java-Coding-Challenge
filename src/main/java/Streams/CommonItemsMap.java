package Streams;

import java.util.Map;
import java.util.stream.Collectors;

public class CommonItemsMap {

    public static void main(String[] args) {

        Map<Character,Integer> integerMap=Map.of('a',1 ,'b',2,'c',3);
        Map<Character,Integer> integerMap2=Map.of('b',2,'c',2,'a',1);

        Map<Character,Integer> result=integerMap.entrySet().stream().filter(character ->integerMap2.containsKey(character.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey,sum->sum.getValue()+integerMap2.get(sum.getKey())));

        System.out.println(result);

    }
}
