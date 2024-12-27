package Java_Program;

import java.util.Arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int[] ans=new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[nums.length+i]=nums[i];
        }
            return ans;
    }

    public static void main(String[] args) {
        int [] nums={1,3,2,1};
        ConcatenationOfArray obj=new ConcatenationOfArray();
        System.out.println(Arrays.toString(obj.getConcatenation(nums)));

    }
}
