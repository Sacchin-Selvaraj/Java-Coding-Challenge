package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumNumber {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(4,5,3,6,3,6);
        Optional<Integer> minimumNumber=numbers.parallelStream().min((o1, o2) -> o1-o2);
        System.out.println(minimumNumber);
    }
}
