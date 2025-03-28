package Recursion;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr={5,4,3,2,1};
        reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int left, int right) {
        if (left>=right)
            return;
        swapArray(arr,left,right);
        reverseArray(arr,left+1,right-1);
    }

    private static void swapArray(int[] arr, int left, int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
