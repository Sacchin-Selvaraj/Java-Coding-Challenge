package Java_Program;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSumAfterKthSelectedElements {
    public static void main(String[] args) {
        int[] nums = {5,10,6};
        int k = 3;
        int mul = 3;
        System.out.println(maxSum(nums,k,mul));
    }

    public static long maxSum(int[] nums, int k, int mul) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            queue.add(nums[i]);

            if(queue.size()>k){
                queue.poll();
            }
        }
        System.out.println(queue);
        Integer[] arr = new Integer[queue.size()];

        int j = 0;

        while (!queue.isEmpty()) {
            arr[j++] = queue.poll();
        }

        System.out.println(Arrays.toString(arr));
        long res=0;

        for(int i=arr.length-1;i>=0;i--){
            if(mul>1){
                res+= (long) arr[i] *mul;

            }else{
                res+=arr[i];
            }
            mul--;
        }

        return res;

    }
}
