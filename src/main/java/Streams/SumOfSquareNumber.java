package Streams;

import java.util.List;
import java.util.stream.Stream;

public class SumOfSquareNumber {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,2,3,4,5);
        List<Integer> numbers2=List.of(6,7,8,9,0);

        int sum= numbers.stream().map(num -> num * num).reduce(Integer::sum).orElse(0);
        System.out.println(sum);

        int product=numbers.stream().reduce((integer, integer2) -> integer*integer2).get();
        System.out.println(product);

        List<Integer> mergedList= Stream.concat(numbers.stream(),numbers2.stream()).sorted().distinct().toList();
        System.out.println(mergedList);


    }
}
