package BinarySearch;

public class Search2DMatrix_1 {

    public static void main(String[] args) {

        int[][] arr={
                {3,4,5,6},
                {7,9,10,11},
                {13,14,16,18}
        };
        int target=17;
        System.out.println(search2DMatrix(arr,target));
    }

    private static boolean search2DMatrix(int[][] arr, int target) {
        int left=0,right=(arr.length*arr[0].length)-1;
        while (left<=right){
            int mid=(left+right)/2;
            int row=mid/arr[0].length;
            int col=mid%arr[0].length;
            if (arr[row][col]==target)
                return true;
            else if (arr[row][col]<target) {
                left=mid+1;
            }else
                right=mid-1;
        }
        return false;
    }
}
