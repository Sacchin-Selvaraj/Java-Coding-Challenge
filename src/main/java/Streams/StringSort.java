package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringSort {
    public static void main(String[] args) {
        String str="Java streams are powerful and Java streams are flexiable";

        Map<String,Long> map=Arrays.stream(str.split("\\s"))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                        .sorted(Map.Entry.comparingByValue())
                                .collect(Collectors.toMap(Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (aLong, aLong2) -> aLong,
                                        LinkedHashMap::new
                                ));


        System.out.println(map);
    }
}
