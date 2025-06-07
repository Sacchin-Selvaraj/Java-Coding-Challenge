package TwoPointer_SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubString {
    public static String minWindow(String s, String t) {
        int left=0,right=0,startingIdx=0,endingIdx=0,minLen=Integer.MAX_VALUE,count=0;
        int len=t.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        while (right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)-1);
            if (map.get(ch)>=0){
                count++;
            }
            if (count==len){
                while (count>=len){
                    if (right-left+1<minLen){
                        startingIdx=left;
                        endingIdx=right;
                        minLen=right-left+1;
                    }
                    char c=s.charAt(left);
                    map.put(c,map.get(c)+1);
                    if (map.get(c)>0)
                        count--;
                    left++;
                }
            }
            right++;
        }
        if (minLen==Integer.MAX_VALUE)
            return "";
        else
            return s.substring(startingIdx,endingIdx+1);
    }
    public static void main(String[] args) {
        String s="aa";
        String t="aa";
        System.out.println(minWindow(s,t));
    }
}
