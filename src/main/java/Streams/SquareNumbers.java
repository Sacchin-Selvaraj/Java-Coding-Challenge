package Streams;

import java.util.Arrays;
import java.util.List;

public class SquareNumbers {

    static {
        System.out.println("4th static block");
    }
    static {
        System.out.println("3rd static block");
    }
    static {
        System.out.println("2nd static block");
    }
    static {
        System.out.println("static block");
    }


    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        nums = nums.stream().map(n -> n * n).toList();

        System.out.println( );
        System.out.println(nums);
        System.out.println("----------------------------------------");

    }
}
