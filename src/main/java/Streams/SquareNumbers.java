package Streams;

import java.util.Arrays;
import java.util.List;

public class SquareNumbers {


    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums = nums.stream().map(n -> n * n).toList();

        System.out.println(nums);
        System.out.println("----------------------------------------");

    }
}
