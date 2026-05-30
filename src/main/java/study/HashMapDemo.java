package study;

import Streams.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class HashMapDemo {
    public static String string="sac";
    public static void main(String[] args) {

        String str = "addeebcccha";// b

        Map<String,Integer> map = new HashMap<>();

        HashMap<Employee,Integer> map1 = new HashMap<>();

        Hashtable<String,Integer> stringIntegerHashtable = new Hashtable<>();



        Optional<Character> firstNonRepeating = str.chars()
                 .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry-> entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(firstNonRepeating.orElse('a'));

        String str2 = "aaaaabbbbcccdde";

        Map<Character,Long> freqMap = str2.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(freqMap);

        Map<Character,Long> sortedMap = freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
                        (aLong, aLong2)-> aLong2,LinkedHashMap::new));

        System.out.println(sortedMap);

        List<Map.Entry<Character,Long>> list = new ArrayList<>(freqMap.entrySet());

        list.sort(Map.Entry.<Character,Long>comparingByValue().reversed());

        for (Map.Entry<Character,Long> entry:list){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
