package Java_Program;

import java.util.*;
import java.util.stream.Stream;

public class SecondLargestNum{

    public static void main(String[] args) {
        int[] arr={5,9,2,4,8,1,6};

        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
        for (int num:arr){
            queue.offer(num);
        }
        System.out.println(queue);

        System.out.println(queue.poll());


       Optional<Integer> num= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("Result "+num);
    }
}
