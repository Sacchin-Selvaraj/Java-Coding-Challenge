package Java_Program;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class TopKElements2 {

    private static List<Integer> findTopkElements(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            queue.add(nums[i]);
            if (queue.size()>k){
                queue.poll();
            }
        }
        return queue.stream().toList();
    }
    public static void main(String[] args) {
        int[] nums={2,3,1,4,8,9,7};
        System.out.println(findTopkElements(nums,2));
    }


}
