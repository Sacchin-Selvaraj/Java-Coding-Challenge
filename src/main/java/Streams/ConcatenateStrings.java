package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConcatenateStrings {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("Sacchin","is","an","Developer","an");

        Optional<String> string=stringList.stream().reduce((s, s2) -> s.concat(" "+s2));
        System.out.println(string.get());

        Map<String,Long> map=stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }
}
