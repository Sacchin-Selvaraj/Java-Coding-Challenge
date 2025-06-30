package BinarySearch;

public class MedianOfMatrix {

    public static void main(String[] args) {
        int[][] arr={
                {1,5,7,9,11},
                {2,3,4,5,10},
                {9,10,12,14,16},
        };
        System.out.println(findMedian2D(arr));
    }

    private static int findMedian2D(int[][] arr) {
        int num=(arr.length*arr[0].length)/2;
        int left=findMinimums(arr);
        int right=findMaximums(arr);

        while (left<=right){
            int mid=(left+right)/2;
            int equals=findMedians(arr,mid);
            if (equals<=num){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }

    private static int findMedians(int[][] arr, int mid) {
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            cnt+=upperBound(arr[i],mid);
        }
        return cnt;
    }

    private static int upperBound(int[] num, int target) {

        int left=0;
        int right=num.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (num[mid]<=target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }

    private static int findMaximums(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][arr[0].length-1]>max){
                max=arr[i][arr[0].length-1];
            }
        }
        return max;
    }

    private static int findMinimums(int[][] arr) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0]<min){
                min=arr[i][0];
            }
        }
        return min;
    }
}
