package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] num1 = {1, 3, 5, 7};
        int[] num2 = {0, 2, 6, 8, 9};
        findSortedArray(num1, num2);
    }

    private static void findSortedArray(int[] num1, int[] num2) {
        // Optimal Solution // gap method
        int len = num1.length + num2.length;
        int gap = len / 2 + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left+gap;
            while (right < len) {
                // arr1 and arr2
                if (left < num1.length && right >= num1.length) {
                    swaparray(num1,num2,left,right-num1.length);
                } else if (left >= num1.length) { // arr2 and arr2
                    swaparray(num2,num2,left-num1.length,right-num1.length);
                } else {  // arr1 and arr1
                    swaparray(num1,num1,left,right);
                }
                left++;
                right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
        System.out.println(Arrays.toString(num1)+" "+Arrays.toString(num2));
    }

    private static void swaparray(int[] num1, int[] num2, int left, int right) {
        if (num1[left]>num2[right]){
            int temp=num1[left];
            num1[left]=num2[right];
            num2[right]=temp;
        }
    }

}
