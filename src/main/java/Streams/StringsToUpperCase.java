package Streams;

import java.util.stream.Stream;

public class StringsToUpperCase {

    public static void main(String[] args) {
        String str="sacchin";
        Stream.of(str).map(String::toUpperCase).forEach(System.out::println);
        //System.out.println(uppercase);
    }

}
