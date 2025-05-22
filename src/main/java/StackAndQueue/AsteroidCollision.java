package StackAndQueue;

import java.util.ArrayDeque;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroid={4,7,1,1,2,-3,-7,17,15,-16};

        System.out.println(findCollison(asteroid));
    }

    private static ArrayDeque<Integer> findCollison(int[] asteroid) {

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        for (int i = 0; i < asteroid.length; i++) {

            while (!stack.isEmpty() && (stack.peek()+asteroid[i]<0 && stack.peek()>0)){
                stack.pop();
            }
            if (stack.isEmpty() || (stack.peek()-asteroid[i]<0 || asteroid[i]>0)) {
                stack.push(asteroid[i]);
            }
            else if (stack.peek()+asteroid[i]==0)
                stack.pop();
        }
        return stack;
    }
}
