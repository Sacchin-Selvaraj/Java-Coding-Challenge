package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class SumOfSubArrayMinimum {

    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        System.out.println(calculateSumOfSubArray(nums));
    }

    private static int calculateSumOfSubArray(int[] nums) {

        int[] nge=findNextSmallerElement(nums);
        int[] pge=findPreviousSmallerElement(nums);
        System.out.println(Arrays.toString(nge));
        System.out.println(Arrays.toString(pge));
        int totalSum=0;
        for (int n = 0; n < nums.length; n++) {
            int left=n-pge[n];
            int right=nge[n]-n;
            totalSum+=(right*left*nums[n]);
        }
        return totalSum;
    }

    private static int[] findPreviousSmallerElement(int[] nums) {
        int[] pge=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0;i < nums.length;i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);  // Store index, not value
        }
        return pge;
    }

    private static int[] findNextSmallerElement(int[] nums) {
        int[] nge=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? nums.length : st.peek();
            st.push(i);  // Store index, not value
        }
        return nge;
    }
}
