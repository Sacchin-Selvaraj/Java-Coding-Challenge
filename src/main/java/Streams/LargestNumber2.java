package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LargestNumber2 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6};

        //n*(n+1)/2;
        int largestNumber=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>largestNumber){
                largestNumber=nums[i];
            }
        }

        int largestNumberFromStream = Arrays.stream(nums).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(largestNumberFromStream);

        String s="sacchin";
        char[] c=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[i]= (char) (s.charAt(i)-32);
        }
        System.out.println(Arrays.toString(c));
        // a = 97-32
        // A = 65
        // 0 = 47
        String name=s.chars().mapToObj(value -> String.valueOf((char) value))
                .map(String::toUpperCase).collect(Collectors.joining(" "));

        System.out.println(name);

        Map<String,Long> map=s.chars().mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
