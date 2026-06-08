package CommonQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {0,0};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num:nums){
            list.add(String.valueOf(num));
        }

        list.sort((a, b) -> (b+a).compareTo(a+b));

        if(list.getFirst().equals("0")) return "0";

        return String.join("", list);
    }
}
