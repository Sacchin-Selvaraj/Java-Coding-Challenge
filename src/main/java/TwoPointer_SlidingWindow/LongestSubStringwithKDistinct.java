package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class LongestSubStringwithKDistinct {

    public static void main(String[] args) {

        String s="aaabbaccd";
        int k=2;
        System.out.println(longestSubString(s,k));
    }

    private static int longestSubString(String s, int k) {
        int left=0,right=0,maxLen=0,len=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            if (map.size()>k){
                char ch=s.charAt(left);
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==0) map.remove(ch);
                left++;
            }
            if (map.size()<=k) {
                len = right - left + 1;
                maxLen=Math.max(maxLen,len);
            }
            right++;
        }
        return maxLen;
    }
}
