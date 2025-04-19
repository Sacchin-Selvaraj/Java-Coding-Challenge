package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMaximumFrequency {

    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("apple", "banana","cherry", "date", "apple", "orange","mango","banana","grape");

        String str=stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey).get();

        System.out.println(str);
    }
}
