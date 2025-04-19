package Arrays;

import java.util.Arrays;

public class RearrangeElements {

    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(findRearrangeElements(nums)));
    }

    private static int[] findRearrangeElements(int[] nums) {

        int[] res=new int[nums.length];
        int postive=0,negative=1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                res[postive]=nums[i];
                postive+=2;
            }else {
                res[negative]=nums[i];
                negative+=2;
            }
        }
        return res;
    }
}
