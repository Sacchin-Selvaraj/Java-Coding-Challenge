package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfStringsByLength {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("apple", "banana","cherry", "date", "fig", "orange","mango","melon","grape");

        Map<Integer,List<String>> fruitsByLength = stringList.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(fruitsByLength);
    }
}
