package Streams;

import java.util.Arrays;
import java.util.List;

public class FindNumberWith1 {

    public static void main(String[] args) {

        List<Integer> integers= Arrays.asList(11,34,15,52,117,347,852,169);

        List<Integer> num=integers.stream().map(String::valueOf)
                .filter(s -> s.charAt(0)=='1').mapToInt(Integer::parseInt).boxed().toList();
        System.out.println(num);

        List<Integer> nums=integers.stream().filter(integer -> String.valueOf(integer).startsWith("1")).toList();
        System.out.println(nums);


    }
}
