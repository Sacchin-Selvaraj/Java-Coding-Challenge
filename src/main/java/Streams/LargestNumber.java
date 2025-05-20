package Streams;

import java.util.*;
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

        List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,8,8,8,8);
        Map<Boolean,List<Integer>> listMap=list1.stream().collect(Collectors.partitioningBy(o -> o%2==0));
        System.out.println(listMap);

        Optional<Integer> second =list1.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        System.out.println(second.orElse(-1));

        List<Integer> list2=Arrays.asList(1,2,3);
        double avg=list2.stream().mapToInt(Integer::intValue).average().orElse(0.00);
        System.out.println("Average "+avg);

        List<Integer> list3=Stream.iterate(0,integer -> integer+2).limit(10).toList();
        System.out.println(list3);

    }
}
