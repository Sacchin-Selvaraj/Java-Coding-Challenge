package BinarySearch;

public class KthElementInSortedArray {

    public static void main(String[] args) {
        int[] num1={2,3,6,7,9};
        int[] num2={1,4,8,10};
        int k=3;
        System.out.println(findKthElement(num1,num2,k));
    }

    private static int findKthElement(int[] num1, int[] num2, int k) {
        int n1=num1.length;
        int n2=num2.length;
        if (n1>n2) return findKthElement(num2,num1,k);
        int left=Math.max(0,k-n2),right=Math.min(k,n1);
        while (left<=right){
            int mid1=(left+right)/2;
            int mid2=k-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if (mid1<n1) r1=num1[mid1];
            if (mid2<n2) r2=num2[mid2];
            if (mid1-1>=0) l1=num1[mid1-1];
            if (mid2-1>=0) l2=num2[mid2-1];
            if (l1<=r2 && l2<=r1)
                return Math.max(l1,l2);
            else if (l1>r2) {
                right=mid1-1;
            }else
                left=mid1+1;
        }
        return 0;
    }
}
