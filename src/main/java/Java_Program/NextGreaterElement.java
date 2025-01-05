package Java_Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:nums2){
            while (!stack.isEmpty()&&(stack.peek()<num)){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }

    public static void main(String[] args) {

        int[] num1={4,1,2};
        int[] num2={1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));


    }
}
