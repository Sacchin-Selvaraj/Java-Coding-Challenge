package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class ToMap {

    public static void main(String[] args) {

        List<String> list = List.of("Sacchin", "Mani", "Riswanth","asdfghj");

        Map<String,Integer> map = list.stream().collect(Collectors.toMap(s->s,s-> s.length()));

        System.out.println(map);

    }
}
