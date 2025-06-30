package BinarySearch;

public class PeakElement2 {

    public static void main(String[] args) {
        int[][] arr={
                {4,2,5,1,4,5},
                {2,9,3,2,3,2},
                {1,7,6,0,1,3},
                {3,6,2,3,7,2}
        };
        System.out.println(findPeakElement2(arr));
    }

    private static int findPeakElement2(int[][] arr) {
        int left=0,right=arr[0].length-1;
        while (left<=right){
            int mid=(left+right)/2;
            int maxElementIdx=findMaximumVertically(arr,mid);
            int leftElement= mid-1>=0?arr[maxElementIdx][mid-1]:-1;
            int rightElement=mid+1<arr[0].length?arr[maxElementIdx][mid+1]:-1;
            int currentElement=arr[maxElementIdx][mid];
            if (currentElement<leftElement){
                right=mid-1;
            }else if (currentElement<rightElement){
                left=mid+1;
            }else
                return currentElement;
        }
        return -1;
    }

    private static int findMaximumVertically(int[][] arr, int mid) {
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][mid] > max) {
                max = arr[i][mid];
                idx = i;
            }
        }
        return idx;
    }
}
