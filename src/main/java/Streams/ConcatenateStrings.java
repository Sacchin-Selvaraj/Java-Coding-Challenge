package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConcatenateStrings {

    public static void main(String[] args) {

        List<String> stringList= Arrays.asList("Sacchin","is","an","Developer");

        Optional<String> string=stringList.stream().reduce((s, s2) -> s.concat(" "+s2));
        System.out.println(string.get());


    }
}
