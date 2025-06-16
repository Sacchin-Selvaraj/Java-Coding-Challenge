package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class CountSubStringsWithKFrequency {
    public static int numberOfSubstrings(String s, int k) {
        int len=s.length();
        int left=0,right=0,substringCount=0;

        while (right<s.length()){
            boolean flag=false;
            if (isValidSubstring(s,k,left,right)){
                substringCount+=len-right;
                left++;
                flag=true;
            }
            if (!flag)
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
        String s="abcde";
        int k=1;
        System.out.println(numberOfSubstrings(s,k));
    }
}
