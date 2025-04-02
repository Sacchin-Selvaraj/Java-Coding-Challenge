package Streams;

import java.util.Arrays;

public class FindNumberGreaterthan10 {

    public static void main(String[] args) {

        int[] arr={2,5,10,15,25};

        Double average= Arrays.stream(arr).filter(num->num>=10).asDoubleStream().average().getAsDouble();
        System.out.println(average);
    }
}
