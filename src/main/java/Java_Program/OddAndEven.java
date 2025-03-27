package Java_Program;

import java.util.ArrayDeque;
import java.util.Arrays;

public class OddAndEven {

    private static int[] makeOddAndEven(int[] num) {

        ArrayDeque<Integer> sortedQueue=new ArrayDeque<>(num.length);
        for (int i : num){
            if (i%2==0){
                sortedQueue.addFirst(i);
            }else {
                sortedQueue.addLast(i);
            }
        }
        return sortedQueue.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {

        int[] num={2,1,3,4,5,6,7,8};
        System.out.println(Arrays.toString(makeOddAndEven(num)));
        System.out.println(Arrays.toString(makeOddAndEvenNoSpace(num)));

    }

    private static int[] makeOddAndEvenNoSpace(int[] num) {

        int left=0;
        int right= num.length-1;
        while (left<right){
            if (num[left]%2==0){
                int temp=num[right];
                num[right]=num[left];
                num[left]=temp;
                right--;
            }else {
                left++;
            }
        }
        return num;
    }

}
