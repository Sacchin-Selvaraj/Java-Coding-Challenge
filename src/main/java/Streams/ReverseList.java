package Streams;

import java.util.Arrays;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,3,2,5,6,7,1);

        List<Integer> sortedList=list.stream().sorted((o1, o2) -> o2-o1).toList();
        System.out.println(sortedList);
    }
}
