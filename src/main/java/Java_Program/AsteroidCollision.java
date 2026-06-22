package Java_Program;

import java.util.ArrayDeque;
import java.util.Arrays;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] nums = {-2,-1,1,-2};
        System.out.println(Arrays.toString(asteroidCollision(nums)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int num:asteroids){
            if(stack.isEmpty()){
                stack.push(num);
                continue;
            }
            if(stack.peek()>0 && num>0){
                stack.push(num);
            }else if(stack.peek()<0 && num<0){
                stack.push(num);
            } else if (stack.peek()<0 && num>0) {
                stack.push(num);
            } else if (Math.abs(stack.peek())==Math.abs(num)) {
                stack.pop();
            } else {
                while(!stack.isEmpty() && Math.abs(stack.peek())<Math.abs(num)){
                    stack.pop();
                }
                if(stack.isEmpty() || Math.abs(stack.peek())>=Math.abs(num)){
                    stack.push(num);
                }
            }
        }

        int[] nums = new int[stack.size()];
        int i=0;
        while (!stack.isEmpty()){
            nums[i++]=stack.pollLast();
        }

        return nums;
    }
}
