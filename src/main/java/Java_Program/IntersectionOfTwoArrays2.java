package Java_Program;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays2 {

    private static List<Integer> findIntersection(int[] num1, int[] num2) {

        int first = 0, second = 0;
        List<Integer> list = new ArrayList<>();
        while (first < num1.length && second < num2.length) {
            if (num1[first] == num2[second]) {
                list.add(num1[first]);
                first++;
                second++;
            } else {
                first++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 3, 4, 4, 5};
        int[] num2 = {2, 3, 4, 5, 6, 7};

        System.out.println(findIntersection(num1, num2));

    }
}
