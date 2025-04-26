package BinarySearch;

public class SearchRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums={7,8,9,1,2,3,4,5,6};
        int num=1;
        System.out.println(findRotatedArray(num,nums));

    }

    private static int findRotatedArray(int num,int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==num)
                return mid;
            if (nums[left]<=nums[mid]){
                if (nums[left]<=num && num<=nums[mid]){
                    right=mid-1;
                }else {
                    left=mid+1;
                }

            }else {
                if (nums[mid]<=num && num<=nums[right]){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }
        }
        return ans;
    }
}
