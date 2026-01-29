package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueWords {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("Java is a Awesome Language","It is an Secure Language");

        Set<String> uniqueWords=list.stream()
                .map(str->str.split("\\s"))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        System.out.println(uniqueWords);
     }
}
