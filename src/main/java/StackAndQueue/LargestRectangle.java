package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangle {

    public static void main(String[] args) {
        int[] values={2,1,5,6,2,3};
        System.out.println(findRectangleArea(values));
    }

    private static int findRectangleArea(int[] values) {

        int nse[]=findNextSmaller(values);
        int pse[]=findPreviousSmaller(values);
        int maximumArea=-1;
        System.out.println(Arrays.toString(nse));
        System.out.println(Arrays.toString(pse));
        for (int i = 0; i < values.length; i++) {
            maximumArea=Math.max(maximumArea,values[i]*(nse[i]-pse[i]-1));
        }
        return maximumArea;

    }

    private static int[] findNextSmaller(int[] values) {
        Stack<Integer> st=new Stack<>();
        int nge[] = new int[values.length];
        for (int i = values.length-1; i >=0 ; i--) {
            while (!st.isEmpty() && values[st.peek()]>=values[i]){
                st.pop();
            }
            nge[i]= st.isEmpty()? values.length : st.peek();
            st.push(i);
        }
        return nge;
    }

    private static int[] findPreviousSmaller(int[] values) {
        Stack<Integer> st=new Stack<>();
        int pse[] = new int[values.length];
        for (int i = 0; i < values.length ; i++) {
            while (!st.isEmpty() && values[st.peek()]>=values[i]){
                st.pop();
            }
            pse[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
}
