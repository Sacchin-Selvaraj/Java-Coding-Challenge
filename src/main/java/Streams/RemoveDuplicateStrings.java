package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateStrings {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("apple", "banana","cherry", "apple", "fig", "cherry","mango","banana","fig");

        Set<String> stringsWithoutDuplicate=stringList.stream().collect(Collectors.toSet());
        System.out.println(stringsWithoutDuplicate);
    }
}
