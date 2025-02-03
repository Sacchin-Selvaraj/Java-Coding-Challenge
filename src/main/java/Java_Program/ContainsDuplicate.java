package Java_Program;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Stack<Integer> queue=new Stack<>();
        for (int i:nums){
            if(!queue.isEmpty()&&queue.contains(i)){
                return true;
            }
            queue.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
