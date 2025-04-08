package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeArray {

    public static void main(String[] args) {
        List<Integer> unsortedArray1= List.of(5,3,1);
        List<Integer> unsortedArray2= List.of(4,2,0);

        List<Integer> sortedArray= Stream.concat(unsortedArray1.stream(),unsortedArray2.stream()).sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedArray);

        List<List<Integer>> integers=List.of(
                List.of(5,3,1),
                List.of(4,2,0)
        );

        List<Integer> sorted=integers.stream().flatMap(List::stream).sorted().toList();
        System.out.println(sorted);
    }
}
