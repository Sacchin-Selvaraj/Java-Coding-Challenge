package StackAndQueue;

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        String s="432219";
        int k=3;
        System.out.println(afterKDigitsRemoved(s,k));
    }

    private static Stack<Integer> afterKDigitsRemoved(String s,int k) {
        Stack<Integer> st=new Stack<>();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            while (( k>0 &&!st.isEmpty()) && st.peek()>=s.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push( s.charAt(i)-'0');
        }

        // need to write edge cases
       return st;
    }
}
