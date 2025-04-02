package Java_Program;

import java.util.Arrays;
import java.util.Collections;

public class LargestPossibleNumber {

    public static void main(String[] args) {

        Integer[] arr={8,6,0,4,6,4,2,7};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=(num*10)+arr[i];
        }
        System.out.println(num);
    }
}
