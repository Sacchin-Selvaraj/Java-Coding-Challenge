package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] nums = {2, 10, 12, 13, 11};
        System.out.println(Arrays.toString(findNextElement(nums)));
    }

    private static int[] findNextElement(int[] nums) {

        int[] res = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length-1){
                res[i]=-1;
            }else {
                while (!st.isEmpty() && st.peek() <= nums[i]) {
                    st.pop();
                }
                if (st.isEmpty()) res[i]=-1;
                else res[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return res;
    }
}
