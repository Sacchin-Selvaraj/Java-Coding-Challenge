package Scalar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

    private static String findLargestnumber(int[] nums) {

        StringBuilder stringBuilder=new StringBuilder();
        List<String> str =new ArrayList<>();
        for (int num:nums){
            str.add(String.valueOf(num));
        }
        Collections.sort(str,(a, b) -> (b+a).compareTo(a+b));

        for (String s:str){
            stringBuilder.append(s);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        int[] nums={3,30,34,5,9};
        System.out.println(findLargestnumber(nums));
    }
}
