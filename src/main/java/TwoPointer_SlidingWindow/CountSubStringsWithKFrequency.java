package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class CountSubStringsWithKFrequency {
    public static int numberOfSubstrings(String s, int k) {
        int len=s.length();
        int left=0,right=0,substringCount=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while (map.get(ch)>=k){
                substringCount+=len-right;
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            right++;
        }
        return substringCount;
    }

    private static boolean isValidSubstring(String s, int k, int left, int right) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = left; i <= right ; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if (map.get(s.charAt(i))>=k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="ajsrhoebe";
        int k=2;
        System.out.println(numberOfSubstrings(s,k));
    }
}
