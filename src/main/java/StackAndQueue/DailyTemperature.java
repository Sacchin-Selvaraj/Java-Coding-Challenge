package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static void main(String[] args) {
        int[] temperatures={89,62,70,58,47,47,46,76,100,70};
        System.out.println(Arrays.toString(findTemperature(temperatures)));
    }

    private static int[] findTemperature(int[] temperatures) {
        Stack<int[]> st=new Stack<>();
        int[] res=new int[temperatures.length];

        for (int i = temperatures.length-1; i >=0 ; i--) {
            if (st.isEmpty())
                st.push(new int[]{temperatures[i],i});
           else {
                while (!st.isEmpty() && temperatures[i]>=st.peek()[0]){
                    st.pop();
                }
                if (st.isEmpty()){
                    res[i]=0;
                }else {
                    res[i]=Math.abs(i-st.peek()[1]);
                }
                st.push(new int[]{temperatures[i],i});
            }
        }
        return res;
    }
}
