package TwoPointer_SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

    public static void main(String[] args) {
        String s="cadbzabc";
        System.out.println(findLongestSunString(s));
        System.out.println(findLongestSunStrings(s));
    }

    private static int findLongestSunStrings(String s) {
        // 0(n) optimal solution
        int left=0,right=0,maxLen=0;
        int[] hash=new int[256];
        while (right<s.length()){
            if (hash[s.charAt(right)]!=0){
                if (hash[s.charAt(right)]>=left){
                    left=hash[s.charAt(right)]+1;
                }
            }
            hash[s.charAt(right)]=right;
            int len=right-left+1;
            maxLen=Math.max(maxLen,len);
            right++;
        }
        return maxLen;
    }

    private static int findLongestSunString(String s) {
        // 0(2n)
        int right=0,maxLen=0;
        List<Character> list=new ArrayList<>();
        while (right<s.length()){
            while (!list.isEmpty() && list.contains(s.charAt(right))){
                list.removeFirst();
            }
            list.add(s.charAt(right));
            maxLen=Math.max(maxLen,list.size());
            right++;
        }
        return maxLen;
    }
}
