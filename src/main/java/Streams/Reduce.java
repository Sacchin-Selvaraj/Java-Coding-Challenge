package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        Integer sum = Arrays.stream(arr).sum();

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);

        Integer sums = list.stream().reduce(1,(a,b)->a+b);

        System.out.println(sums);

        List<String> names = List.of("Java", "Spring", "Boot");

        String result = names.stream()
                .reduce("", (a,b) -> a + " " + b);

        Integer factorial = IntStream.range(1,5).reduce(1,(a,b)->a*b);

        System.out.println(factorial);

        Integer sumOfEven = list.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();




    }
}
