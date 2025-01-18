package Java_Program;

import java.util.*;


// LeetCode 239
public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {

        int n=nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.add(nums[i]);
        }


        System.out.println(deque.poll());
        System.out.println(deque);
        return nums;
    }


    public static void main(String[] args) {
        int[] num={1,3,-1,-3,5,3,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the K Number :");
        int k=sc.nextInt();
        int[] Result=SlidingWindowMaximum.maxSlidingWindow(num,k);
        System.out.println("Output :"+ Arrays.toString(Result));

    }
}
