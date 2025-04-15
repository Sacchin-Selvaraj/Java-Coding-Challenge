package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,12,2,3);

       Optional<Integer> sum=numbers.stream().filter(num->num%2==1).reduce(Integer::sum);
        System.out.println(sum.get());

        Map<Boolean,Integer> map=numbers.stream().collect(Collectors.partitioningBy(num->num%2==0
                ,Collectors.summingInt(Integer::intValue)));

        System.out.println(map);

        List<Integer> duplicates=numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(integer -> integer.getValue()>1).map(Map.Entry::getKey).toList();

        System.out.println(duplicates);

        List<Integer> number1=numbers.stream().filter(num->String.valueOf(num).startsWith("1")).toList();
        System.out.println(number1);

    }
}
