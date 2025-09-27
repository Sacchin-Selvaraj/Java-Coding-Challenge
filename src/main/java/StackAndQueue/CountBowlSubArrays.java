package StackAndQueue;

import java.util.Stack;

public class CountBowlSubArrays {

    public static void main(String[] args) {
        int[] nums={5,1,2,3,4};
        System.out.println(bowlSubArrays(nums));
    }
    public static long bowlSubArrays(int[] A) {
        long res = 0;
        Stack<Integer> s = new Stack<>();
        for (int r = 0; r < A.length; ++r) {
            int a = A[r];
            while (!s.empty() && A[s.peek()] <= a) {
                int l = s.pop();
                if (r - l + 1 >= 3) {
                    res += 1;
                }
            }
            if (!s.empty() && r - s.peek() + 1 >= 3) {
                res += 1;
            }
            s.push(r);
        }
        return res;
    }
}
