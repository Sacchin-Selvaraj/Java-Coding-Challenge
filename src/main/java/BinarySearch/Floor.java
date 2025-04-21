package BinarySearch;

public class Floor {

    public static void main(String[] args) {

        int[] nums={10,20,30,40,50};
        int num=25;
        System.out.println(findCeil(nums,num));
        System.out.println(findFloor(nums,num));
    }

    private static int findFloor(int[] nums, int num) {
        int left=0,right=nums.length-1;
        int ans=0;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]<=num){
                ans=nums[mid];
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return ans;
    }

    private static int findCeil(int[] nums, int num) {
        int left=0,right=nums.length-1;
        int ans=0;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (nums[mid]>=num){
                ans=nums[mid];
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return ans;
    }
}
