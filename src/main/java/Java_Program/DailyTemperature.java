package Java_Program;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> st=new Stack<>();
        int[] result=new int[temperatures.length];
        for (int i = 0; i < temperatures.length-1; i++) {
            for (int j = i+1; j < temperatures.length; j++) {
                if(temperatures[i]<temperatures[j]){
                    result[i]=j-i;
                    break;
                }
                else{
                    result[i]=0;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={30,40,50,60};
        System.out.println("Output : "+ Arrays.toString(dailyTemperatures(nums)));

    }


}
