package Java_Program;

import java.util.PriorityQueue;

public class KthLargestElementInStream {

    int k;
    PriorityQueue<Integer>minHeap=new PriorityQueue<>();
    public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.offer(num);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
        }
    }


    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.offer(val);
            minHeap.poll();
        }
        return minHeap.peek();

    }

    public static void main(String[] args) {
        int[] nums={4,5,8,2};
        int k=3;
        KthLargestElementInStream obj=new KthLargestElementInStream(k,nums);
    }
}
