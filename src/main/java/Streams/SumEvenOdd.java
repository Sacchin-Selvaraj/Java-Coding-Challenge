package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumEvenOdd {

    public static void main(String[] args) {

        List<Integer> integers= Arrays.asList(1,2,3,4,5,6);
        int evenSum=integers.stream().filter(num->num%2==0).reduce(Integer::sum).orElse(0);
        System.out.println(evenSum);

        Map<Boolean,Integer> sum=integers.stream().collect(Collectors.partitioningBy(num->num%2==0, Collectors.summingInt(Integer::intValue)));
        System.out.println(sum);
    }
}
