package Java_Program;

import java.util.Arrays;

public class MovesZerosToEnd {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,4,0,5,0};
        int left=0;
        int right=0;
        while (right < arr.length) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
