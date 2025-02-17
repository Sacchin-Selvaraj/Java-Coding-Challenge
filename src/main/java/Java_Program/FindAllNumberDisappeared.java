package Java_Program;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumberDisappeared {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int[] arr=new int[nums.length+1];
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]=1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==0){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
