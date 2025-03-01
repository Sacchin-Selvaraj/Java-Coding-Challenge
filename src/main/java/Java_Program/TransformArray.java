package Java_Program;

import java.util.*;
import java.util.stream.Collectors;

public class TransformArray {
    public static int[] transformArray(int[] nums) {

        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        for (int i:nums){
           if(i%2==0){
               arrayDeque.addFirst(0);
           }else {
               arrayDeque.addLast(1);
           }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=arrayDeque.poll();
        }

        return nums;




    }


    public static void main(String[] args) {

        int[] arr={4,3,2,1};
        System.out.println(Arrays.toString(transformArray(arr)));
    }
}
