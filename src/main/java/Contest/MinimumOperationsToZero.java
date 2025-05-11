package Contest;

import java.util.Stack;

public class MinimumOperationsToZero {
    public static int minOperations(int[] nums) {

        Stack<Integer> st = new Stack<>();
        st.push(0);
        int res = 0;
        for (int num : nums) {
            while (!st.empty() && st.peek() > num) {
                st.pop();
            }
            if (st.empty() || st.peek() < num) {
                res++;
                st.push(num);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {3, 1, 2, 1};
        System.out.println(minOperations(num));
    }
}
