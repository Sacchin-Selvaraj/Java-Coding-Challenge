package Java_Program;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {

    public static int[] nextGreaterElements(int[] nums) {

        Stack<Integer>stack=new Stack<>();
        int n=nums.length;
        int[] result=new int[n];
        for (int i = n-1; i >= 0 ; i--) {
            stack.push(nums[i]);
        }
        for (int i = n-1; i >= 0; i--) {

            while (!stack.isEmpty()&&nums[i]>=stack.peek()){
                stack.pop();
            }

            result[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(nums[i]);

        }
        return result;

    }


    public static void main(String[] args) {

        int[] num={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(num)));


    }
}
//int maxValue=Integer.MIN_VALUE;
//
//        for (int i = 0; i <= nums.length-1; i++) {
//        if(i<=nums.length-2&&nums[i]<nums[i+1]){
//nums[i]=nums[i+1];
//        }else{
//        if(nums[i]>=maxValue)
//nums[i]=-1;
//        else
//nums[i]=maxValue;
//            }
//                    if(nums[i]>maxValue){
//maxValue=nums[i];
//        }
//        }
//        return nums;