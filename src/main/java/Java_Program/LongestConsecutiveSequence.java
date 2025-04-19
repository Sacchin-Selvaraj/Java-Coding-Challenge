package Java_Program;

import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequence {

    private static int findLongestSequence(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Iterator<Integer> iterable=set.iterator();
        int len=Integer.MIN_VALUE;
        while (iterable.hasNext()){
            int temp=iterable.next();
            if (!set.contains(temp-1)){
                int count=0;
                while (set.contains(temp)){
                   count++;
                   temp+=1;
                }
                len=Math.max(len,count);
            }
        }

        return len;
    }
    public static void main(String[] args) {
        int[] nums={102,4,100,1,101,3,2};
        System.out.println(findLongestSequence(nums));
    }

}
