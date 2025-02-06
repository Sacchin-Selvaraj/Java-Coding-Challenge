package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Streams {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4,3,1,6,3,7,8,9,0,1));
        List<Double> num=nums.stream().map(Integer::doubleValue).toList();
        System.out.println(num);

    }
}
