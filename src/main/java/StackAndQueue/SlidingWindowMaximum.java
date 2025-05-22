package StackAndQueue;

import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] values={1,3,-1,-3,5,3,7,1,6};
        System.out.println(findMaximumWindow(values,3));
    }

    private static List<Integer> findMaximumWindow(int[] values,int k) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < values.length; i++) {

            if(!deque.isEmpty() && deque.peekLast()<=i-k)
                deque.pop();
            while ((!deque.isEmpty() && values[deque.peek()]<=values[i])){
                deque.pop();
            }
            deque.push(i);

            if (i>=k-1)
                list.add(values[deque.peekLast()]);
        }
        return list;
    }
}
