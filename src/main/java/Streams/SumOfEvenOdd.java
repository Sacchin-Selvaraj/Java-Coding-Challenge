package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfEvenOdd {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean,Integer> sumMap=list.stream()
                .collect(Collectors.partitioningBy(n->n%2==0,Collectors.summingInt(Integer::intValue)));

        System.out.println(sumMap);
    }
}
