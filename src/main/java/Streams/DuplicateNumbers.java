package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,4,5,7,2,1,4);
        Map<Integer,Long> duplicateNumber=list.stream().collect(Collectors.groupingBy(integer -> integer,Collectors.counting()));

        Object[] duplicateNumberinList=duplicateNumber.entrySet().stream().filter(integerLongEntry ->integerLongEntry.getValue()>1)
                .toArray();
        System.out.println(Arrays.toString(duplicateNumberinList));


        List<Integer> duplicateNumbers=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter(num->num.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(duplicateNumbers);
    }
}
