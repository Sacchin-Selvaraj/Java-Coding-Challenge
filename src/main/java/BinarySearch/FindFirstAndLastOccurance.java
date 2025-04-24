package BinarySearch;


import java.util.Arrays;

public class FindFirstAndLastOccurance {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 8, 9};
        int num = 8;
        System.out.println(Arrays.toString(findFirstAndLastOccurance(nums, num)));
    }

    private static int[] findFirstAndLastOccurance(int[] nums, int num) {

        int firstOccurance=findFirstOcc(nums, num);
        if (nums[firstOccurance]!=num)
            return new int[]{-1,-1};
        int lastOccurance=findLast(nums, num);
        return new int[]{firstOccurance,lastOccurance};
    }

    private static int findFirstOcc(int[] nums, int num) {

        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (nums[mid]>=num){
                ans=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }

    private static int findLast(int[] nums, int num) {
        int last = -1;
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > num) {
                last = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return last - 1;
    }
}
