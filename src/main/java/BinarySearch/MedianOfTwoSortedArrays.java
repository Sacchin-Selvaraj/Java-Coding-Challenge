package BinarySearch;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] num1={2,3,4};
        int[] num2={1,3};
        System.out.println(findMedian(num1,num2));
    }

    private static int findMedian(int[] num1, int[] num2) {
        int n=num1.length+num2.length;
        int i=0,j=0,k=0;
        int median=0;
        int[] res=new int[n];
        while (i<num1.length && j<num2.length){
            if (num1[i]<num2[j]){
                res[k]=num1[i];
                i++;
            }else {
                res[k]=num2[j];
                j++;
            }
            k++;
        }
        while (i<num1.length){
            res[k]=num1[i];
            i++;
            k++;
        }
        while (j<num2.length){
            res[k]=num1[j];
            j++;
            k++;
        }
        if (n%2==0){
            median=res[n/2]+res[n/2+1];
        }else
            median=res[n/2];

        System.out.println(Arrays.toString(res));
        return median;
    }
}
