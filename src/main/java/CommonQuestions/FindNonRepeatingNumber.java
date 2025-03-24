package CommonQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindNonRepeatingNumber {

    private static void findNonRepeatingNumber(int[] nums) {

        boolean[] view=new boolean[nums.length];
        Arrays.fill(view,true);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (!view[j])
                    continue;
                if (nums[i]==nums[j]){
                    view[j]=false;

                }

            }
            if (view[i])
                System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {
        int[] nums={10, 30, 40, 20, 10, 20, 50, 10, 30};
        findNonRepeatingNumber(nums);
        findNonRepeatingNumberBySet(nums);
    }

    private static void findNonRepeatingNumberBySet(int[] nums) {

        HashSet<Integer> integers=new LinkedHashSet<>();
        for (int num:nums){
            integers.add(num);
        }
        System.out.println(integers);
    }


}
