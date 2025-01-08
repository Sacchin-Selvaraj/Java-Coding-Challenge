package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesInArray {

    public static List<Integer> findDuplicates(int[] nums) {

        int j=0;
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[j]){
                list.add(nums[i]);
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
