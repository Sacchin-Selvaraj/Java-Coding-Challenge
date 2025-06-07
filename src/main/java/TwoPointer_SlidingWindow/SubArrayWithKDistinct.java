package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class SubArrayWithKDistinct {

    public static void main(String[] args) {
        int[] nums={1,2,1,3,4};
        int k=3;
        System.out.println(numberSubArray(nums,k)-numberSubArray(nums,k-1));
    }

    private static int numberSubArray(int[] nums, int k) {
        if (k<0) return 0;
        int left=0,right=0,count=0,n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        while (right<n){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while (map.size()>k){
                int num=nums[left];
                map.put(num,map.get(num)-1);
                if (map.get(num)==0)
                    map.remove(num);
                left++;
            }
            count+=right-left+1;
            right++;
        }
        return count;
    }
}
