package DSA;

import java.util.Scanner;

public class BinarySearch {

    public static int Search(int[] arr,int k) {
        if (arr.length == 0 || arr.length == 1)
            return 0;
        int start = 0;
        int last = arr.length - 1;

        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (arr[mid] == k)
                return mid;
            if (arr[mid] > k)
                last = mid-1;
            else
                start = mid+1;
        }
        return -1;


    }


    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,9};
        System.out.println("Enter the Kth element");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int result=BinarySearch.Search(arr,k);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
        sc.close(); // Close the scanner

    }
}
