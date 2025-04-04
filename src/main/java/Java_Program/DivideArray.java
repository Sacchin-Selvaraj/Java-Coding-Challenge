package Java_Program;

import java.util.ArrayDeque;
import java.util.Arrays;

public class DivideArray {

    public static boolean divideArray(int[] nums) {

        ArrayDeque<Integer> stack=new ArrayDeque<>();
        Arrays.sort(nums);
        for (int num:nums){
            if (!stack.isEmpty()&&stack.peek()==num){
                stack.poll();
            }else {
                stack.add(num);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int [] nums={3,2,3,2,2,1,2};
        System.out.println(divideArray(nums));
    }
}
