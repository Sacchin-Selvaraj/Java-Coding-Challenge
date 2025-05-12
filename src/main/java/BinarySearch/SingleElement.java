package BinarySearch;

public class SingleElement {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 5, 5, 6, 6, 7, 7};
        System.out.println(findSingleElement(nums));
    }

    private static int findSingleElement(int[] nums) {
        if (nums.length == 1) return nums[0];

        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        int left = 1, right = nums.length - 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
