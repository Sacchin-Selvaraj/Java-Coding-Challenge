package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


abstract class threads {
    public threads() {
    }
}

class display implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


public class Streams {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 3, 1, 6, 3, 7, 8, 9, 0, 1));

        nums.forEach(integer -> System.out.println("Hello"));

        Stream<Integer> num2=nums.stream().map(integer -> integer%2);
        System.out.println(num2.toList());

        List<Integer> num3=nums.stream().filter(a->a>5).toList();
        System.out.println(num3);

       List<Integer> temp=nums.stream().sorted((o1, o2) -> o2-o1).limit(2).skip(1).toList();
        System.out.println(temp);




    }
}
