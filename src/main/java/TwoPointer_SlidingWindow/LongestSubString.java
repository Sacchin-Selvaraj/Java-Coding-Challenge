package TwoPointer_SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

    public static void main(String[] args) {
        String s="cadbzabcde";
        System.out.println(findLongestSunString(s));
    }

    private static int findLongestSunString(String s) {
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
