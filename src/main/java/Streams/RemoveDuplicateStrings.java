package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("apple", "banana","cherry", "apple", "fig", "cherry","mango","banana","fig");

        Set<String> stringsWithoutDuplicate=stringList.stream().collect(Collectors.toSet());
        System.out.println(stringsWithoutDuplicate);

        String str="sacchin";
        String output=str.chars().mapToObj(value -> (char)value).collect(Collectors.toCollection(LinkedHashSet::new))
                .stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(output);

        String reversed = str.chars()
                .mapToObj(c -> (char)c)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(reversed);
    }



}
