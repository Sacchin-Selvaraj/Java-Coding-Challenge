package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            if (binarySearch(num, nums2)) {
                result.add(num);
            }
        }

        // Convert the result list to an array
        return result.stream().mapToInt(i -> i).toArray();

    }

    public static boolean binarySearch(int k,int[] nums2){
        int start=0;
        int mid=0;
        int end = nums2.length-1;
        while(start<=end){
             mid=start+(end-start)/2;
            if(nums2[mid]==k){
                nums2[mid]=-1;
                return true;}
            else if (k>nums2[mid]) {
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num1={1,2,2,1};
        int[]  num2={2};
        System.out.println(Arrays.toString(IntersectionofTwoArrays.intersection(num1, num2)));

    }
}
