package Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeArrayAscending {

    public static int maximumPossibleSize(int[] nums) {

        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        int right=1;
        int temp=nums[0];
        while (right<nums.length){
            if (temp > nums[right]){
                right++;
            }else {
                list.add(nums[right]);
                temp=nums[right];
                right++;
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        int[] nums={4,2,5,3,5};
        System.out.println(maximumPossibleSize(nums));
    }
}
