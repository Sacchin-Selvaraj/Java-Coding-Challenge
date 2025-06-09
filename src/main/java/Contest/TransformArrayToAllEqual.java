package Contest;

import java.util.ArrayDeque;

public class TransformArrayToAllEqual {

    public static boolean canMakeEqual(int[] nums, int k) {
//        int minusOne=0;
//        ArrayDeque<Integer> deque=new ArrayDeque<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]==-1) {
//                minusOne++;
//                deque.add(i);
//            }
//        }
//        if (minusOne%2==1) return false;
//        else{
//            int first=deque.peekFirst();
//            int last=deque.pollLast();
//            int num=last-first;
//            if (num<=k) return true;
//        }

        return canMakeArrayEqual(nums.clone(),k,1) || canMakeArrayEqual(nums.clone(),k,-1);
    }

    private static boolean canMakeArrayEqual(int[] nums, int k, int target) {
        int flips=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]!=target){
                nums[i]*=-1;
                nums[i+1]*=-1;
                flips++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=target) return false;
        }

        return flips<=k;

    }

    public static void main(String[] args) {
        int[] nums={1,-1,1,-1,1,-1,1,-1,-1,-1};
        int k=4;
        System.out.println(canMakeEqual(nums,k));
    }
}
