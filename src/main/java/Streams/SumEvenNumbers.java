package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4);

       Optional<Integer> sum=numbers.stream().filter(num->num%2==1).reduce(Integer::sum);
        System.out.println(sum.get());

        Map<Boolean,Integer> map=numbers.stream().collect(Collectors.partitioningBy(num->num%2==0
                ,Collectors.summingInt(Integer::intValue)));

        System.out.println(map);

    }
}
