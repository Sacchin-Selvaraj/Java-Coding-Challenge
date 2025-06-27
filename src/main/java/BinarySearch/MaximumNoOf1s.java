package BinarySearch;

public class MaximumNoOf1s {

    public static void main(String[] args) {
        int[][] arr={
                {0,0,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1}
        };
        System.out.println(countNumberOfMaximumRows(arr));
    }

    private static int countNumberOfMaximumRows(int[][] arr) {
        int idx=-1;
        int maxCount=-1;
        int n=arr.length;
        int m=arr[0].length;
        for (int i = 0; i < n; i++) {
            int count=maximum1s(arr[i],m);
            if (count>maxCount){
                maxCount=count;
                idx=i;
            }
        }
        return idx;
    }

    private static int maximum1s(int[] nums, int m) {
        int left=0,right=m-1;
        int idx=m;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==1){
                idx=mid;
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return m-idx;
    }
}
