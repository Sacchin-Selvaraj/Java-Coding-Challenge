package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "Hello Java";
        String str1 = str.chars().mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .keySet().stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println(str1);

        String str2 = str.chars().distinct().mapToObj(value -> (char) value).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString();
        System.out.println(str2);

        String str3 = str.chars().distinct().mapToObj(value -> String.valueOf((char) value)).collect(Collectors.joining());
        System.out.println(str3);

        int[] num1={3,1,2};
        int[] num2={5,4,6};

        List<Integer> list=new ArrayList<>();

        String str6="Sacchin";

        Map<Character,Long> map = str6.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));

        System.out.println(map);
    }
}
