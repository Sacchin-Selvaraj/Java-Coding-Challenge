package Java_Program;

import java.util.*;

public class SecondLargestNum{

    public static void main(String[] args) {
        int[] arr={5,9,2,4,8,1,6,9,8,9,8,8,7,9,7,9};

        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
        for (int num:arr){
            queue.offer(num);
        }
        System.out.println(queue);

        System.out.println(queue.poll());


       Optional<Integer> num= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("Result "+num);

        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int nums:arr){
            if(nums>largest){
                second=largest;
                largest=nums;
            } else if (nums>second && nums!=largest) {
                second=nums;
            }
        }

        System.out.println("Output "+second);
    }
}
