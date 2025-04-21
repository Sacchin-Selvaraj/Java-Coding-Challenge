package BinarySearch;

class LowerBound {

    private static int findLowerBound(int[] nums, int num) {

        int left = 0, right = nums.length - 1;
        int res = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= num) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 9};
        int num = 6;
        System.out.println(findLowerBound(nums, num));
    }

}
