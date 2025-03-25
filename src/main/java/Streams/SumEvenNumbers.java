package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,10);

       Optional<Integer> sum=numbers.stream().filter(num->num%2==1).reduce(Integer::sum);
        System.out.println(sum.get());
    }
}
