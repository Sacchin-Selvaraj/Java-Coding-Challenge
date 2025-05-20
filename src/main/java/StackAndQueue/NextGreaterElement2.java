package StackAndQueue;

import java.util.*;

public class NextGreaterElement2 {

    public static void main(String[] args) {

        int[] nums = {2, 10, 12, 1, 11};
        System.out.println(Arrays.toString(findNextElement(nums)));
    }
    // double modulo method not used but it is the optimal solution
    private static int[] findNextElement(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 2; i >= 0; i--) {
            st.push(nums[i]);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else res[i]=st.peek();
            st.push(nums[i]);
        }
        return res;
    }

}
