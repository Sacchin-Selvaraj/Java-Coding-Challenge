package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddOrEven {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        Map<Boolean,List<Integer>> numberMap = Arrays.stream(arr)
                .boxed().collect(Collectors.partitioningBy(n-> n%2==0));

        numberMap.forEach((a,b)-> System.out.println(a+" "+ b));
    }
}
