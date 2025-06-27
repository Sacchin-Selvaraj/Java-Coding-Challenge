package BinarySearch;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] num1={1,3,4,7,10,12};
        int[] num2={2,3,6,15};
        System.out.println(findMedian(num1,num2));
        System.out.println(findMedianByBinarySearch(num1,num2));
    }

    private static double findMedianByBinarySearch(int[] num1, int[] num2) {
        int n1=num1.length;
        int n2=num2.length;
        if (n1>n2) return findMedianByBinarySearch(num2,num1);
        int left=0,right=n1;
        int low=(n1+n2+1)/2;
        while (left<=right){
            int mid1=(left+right)/2;
            int mid2=low-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if (mid1<n1) r1=num1[mid1];
            if (mid2<n2) r2=num2[mid2];
            if (mid1-1>=0) l1=num1[mid1-1];
            if (mid2-1>=0) l2=num2[mid2-1];
            if (l1<=r2 && l2<=r1){
                if ((n1+n2)%2==1) return Math.max(l1,l2);
                return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            } else if (l1>r2) {
                right=mid1-1;
            }else
                left=mid1+1;
        }
        return 0;
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
            median=(res[n/2]+res[n/2-1])/2;
        }else
            median=res[n/2];

        System.out.println(Arrays.toString(res));
        return median;
    }
}
