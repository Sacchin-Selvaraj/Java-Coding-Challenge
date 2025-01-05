package Java_Program;

import java.util.*;

public class WithMostNoOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max=findMaximum(candies);
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            System.out.println(candies[i]);
            if(candies[i]+extraCandies>=max){
               result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;

    }

    private static int findMaximum(int[] temp) {
        int max = Integer.MIN_VALUE;
        for (int candy : temp) {
            if (candy > max) {
                max = candy;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] kids={2,3,5,1,3};
        int extra=3;
        System.out.println(kidsWithCandies(kids,extra));

    }
}
