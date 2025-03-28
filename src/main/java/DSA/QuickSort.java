package DSA;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5, 2, 1, 6, 3, 7, 9, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        int partion=0;
        if (low<high){
            partion=findPartion(arr,low,high);
            quickSort(arr,low,partion-1);
            quickSort(arr,partion+1,high);
        }
    }

    private static int findPartion(int[] arr, int low, int high) {

        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i<j){
            while (arr[i]<=pivot&&i<=high-1){
                i++;
            }
            while (arr[j]>pivot&&j>=low+1){
                j--;
            }
            if (i<j){
                swapNumber(arr,i,j);
            }
        }
        swapNumber(arr,low,j);
        return j;
    }

    private static void swapNumber(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
