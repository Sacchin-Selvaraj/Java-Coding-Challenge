package CommonQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SortByYValue {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,5),Arrays.asList(2,3),Arrays.asList(3,8),Arrays.asList(4,1),
                Arrays.asList(2,5));

        System.out.println(list);

        list.sort((a, b) -> {
            if (!Objects.equals(a.get(1), b.get(1))) return b.get(1)-a.get(1);
            return a.get(0)-b.get(0);
        } );

        System.out.println("After Sorting : "+list);
    }
}
