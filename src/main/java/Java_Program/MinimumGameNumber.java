package Java_Program;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class MinimumGameNumber {
    public static int[] numberGame(int[] nums) {

        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int[] result=new int[nums.length];

        for (int i:nums){
            heap.add(i);
        }
        System.out.println(heap);

        for (int i = 0; i < nums.length; i++) {

            if(i%2==0){
                result[i+1]=heap.poll();
            }else{
                result[i-1]=heap.poll();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums ={5,4,2,3};

        System.out.println(Arrays.toString(numberGame(nums)));

    }
}
