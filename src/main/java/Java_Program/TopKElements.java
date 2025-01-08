package Java_Program;

import java.util.PriorityQueue;

public class TopKElements {

    public static void toFindKElement(int[] nums){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for (int i = 0; i < 3; i++) {
            minHeap.add(nums[i]);
        }

        for (int i = 3; i < 6; i++) {
            minHeap.add(nums[i]);
            if(minHeap.size()>3){
                minHeap.poll();
            }
        }
        System.out.println(minHeap);
    }

    public static void main(String[] args) {
        int[] nums={5,4,6,3,8,1};

        toFindKElement(nums);
    }
}
