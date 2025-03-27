package DSA;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 1, 6, 3, 7, 9, 8};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        mergeArray(arr, low, mid, high);
    }

    private static void mergeArray(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;
        int[] temp=new int[high - low + 1];
        int k=0;
        while (left <= mid && right <= high) {
            if (arr[left]<arr[right]){
               temp[k++]=arr[left];
                left++;
            }else {
                temp[k++]=arr[right];
                right++;
            }
        }
        while (left<=mid){
            temp[k++]=arr[left];
            left++;
        }
        while (right<=high){
            temp[k++]=arr[right];
            right++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

    }
}
