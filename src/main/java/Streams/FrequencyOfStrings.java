package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfStrings {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("apple", "banana","cherry", "date", "fig", "orange","mango","apple","grape");

        List<Long> frequency=stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).map(Map.Entry::getValue).toList();
        System.out.println(frequency);

        Map<String,Long> frequencyMap=stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequencyMap);

        List<String> sortByLength=stringList.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println(sortByLength);

        String word= stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).toString();
        System.out.println(word);
    }
}
