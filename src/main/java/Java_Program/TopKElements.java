package Java_Program;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TopKElements {

    public static void toFindKElement(int[] nums){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int[] result=new int[3];

        for (int i = 0; i < 3; i++) {
            minHeap.add(nums[i]);
        }
        int j=0;
        for (int i = 3; i < 6; i++) {
            minHeap.add(nums[i]);
            if(minHeap.size()>3){
                result[j++]=minHeap.poll();
            }
        }
        System.out.println(minHeap);

        System.out.println("Smallest Number :"+ Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] nums={5,4,6,3,8,1};

        toFindKElement(nums);
    }
}
