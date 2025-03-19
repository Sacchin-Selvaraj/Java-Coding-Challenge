package Streams;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {
    public static void main(String[] args) {

        String str="java";
        Map<Character, Long> map= str.chars().mapToObj(value -> (char)value).
                collect(Collectors.groupingBy(character -> character,Collectors.counting()));
        System.out.println(map);
    }
}
