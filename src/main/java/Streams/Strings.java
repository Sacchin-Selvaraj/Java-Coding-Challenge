package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {
    public static void main(String[] args) {

        String str="java";
        Map<Character, Long> map= str.chars().mapToObj(value -> (char)value).
                collect(Collectors.groupingBy(character -> character,Collectors.counting()));
        System.out.println(map);

        String word="Java is fun and Java is powerful";
        Map<String,Long> map1= Arrays.stream(word.split(" ")).collect(Collectors.groupingBy(word1->word1,Collectors.counting()));
        System.out.println(map1);

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        String word3=words.stream().min(Comparator.comparing(String::length)).get();
        System.out.println(word3);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(9,7,8);
        List<Integer> mergedList=Stream.of(list1,list2,list3).flatMap(List::stream).sorted(Comparator.reverseOrder()).toList();
        System.out.println(mergedList);

        List<Integer> numbers = Arrays.asList(5, 8, 12, 3, 20);
        Optional<Integer>num =numbers.stream().filter(nums->nums>10).findFirst();
        System.out.println(num.get());

        List<Integer> numbers1 = Arrays.asList(5, 8, 12, 3, 20);
        int min=numbers1.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(min);

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 2, 3);
        Set<Integer> set=new HashSet<>();
        Set<Integer> res=numbers2.stream().filter(integer -> Collections.frequency(numbers2,integer)>1).collect(Collectors.toUnmodifiableSet());
        System.out.println(res);

        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean,List<Integer>> map2=numbers3.stream().collect(Collectors.partitioningBy(integer -> isprime(integer)));
        System.out.println(map2);

    }

    private static boolean isprime(Integer integer) {
        if (integer<=1)
            return false;
        for (int i = 2; i < Math.sqrt(integer); i++) {
            if (integer%i==0)
                return false;

        }
        return true;
    }

}
