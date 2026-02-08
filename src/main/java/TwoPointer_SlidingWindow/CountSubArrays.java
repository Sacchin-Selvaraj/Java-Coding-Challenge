package TwoPointer_SlidingWindow;

import java.util.*;

public class CountSubArrays {

    public static void main(String[] args) {
        int[] nums={5,5,5,5};
        long k = 0;
        System.out.println(countSubarrays(nums, k));
    }
    public static long countSubarrays(int[] nums, long k) {

        int left=0;
        long count=0;
        Deque<Integer> max=new ArrayDeque<>();
        Deque<Integer> min=new ArrayDeque<>();

        for(int right=0;right<nums.length;right++){

            while(!max.isEmpty()&&(long)nums[max.peekLast()]<(long)nums[right]){
                max.pollLast();
            }
            max.addLast(right);

            while(!min.isEmpty()&&(long)nums[min.peekLast()]>(long)nums[right]){
                min.pollLast();
            }
            min.addLast(right);

            while((( (long)nums[max.peekFirst()] - (long)nums[min.peekFirst()])* (right -left +1)) > k){

                if(max.peekFirst()==left) max.pollFirst();
                if(min.peekFirst()==left) min.pollFirst();
                left++;

            }

            count+=(right-left+1);

        }

        return count;

    }
}
