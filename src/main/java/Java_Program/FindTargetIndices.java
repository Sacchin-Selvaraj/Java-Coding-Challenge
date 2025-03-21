package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndices {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target)
                list.add(mid);
            if (nums[mid]<target) {
                start = mid;
                start++;
            }
            else {
                end = mid;
                end--;
            }
        }
        list.sort((o1, o2) -> o1-o2);
        return list;
    }

    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
        System.out.println(targetIndices(nums,2));
    }
}
