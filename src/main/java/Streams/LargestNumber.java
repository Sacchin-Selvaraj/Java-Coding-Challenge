package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargestNumber {
    public static void main(String[] args) {

        int max= Stream.of(1,2,3).reduce(Integer::sum).get();

        List<String> list= Arrays.asList("Sacchin","Dhoni","Sacchin");
        Map<String,Long> map=list.stream().collect(Collectors.groupingBy(o -> o,Collectors.counting()));

        String str="SacchinS";
        Character res=str.chars().mapToObj(c->(char)c).filter(ch->str.indexOf(ch)==str.lastIndexOf(ch)).findFirst().get();

        System.out.println(res);
    }
}
