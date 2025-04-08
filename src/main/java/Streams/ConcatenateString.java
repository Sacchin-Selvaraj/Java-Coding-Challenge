package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConcatenateString {

    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("Apple","Banana","Guava");

        String concatenatedString=stringList.stream().collect(Collectors.joining(","));
        System.out.println(concatenatedString);

    }
}
