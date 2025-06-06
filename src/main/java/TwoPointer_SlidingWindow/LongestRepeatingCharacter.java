package TwoPointer_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacter {

    public static int characterReplacements(String s, int k) {
        int left=0,right=0,len=0,maxLen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while (right<s.length()){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while (map.size()>2){
                char ch=s.charAt(left);
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==0)
                    map.remove(ch);
                left++;
            }
            if (isValidMap(map,k) || map.size()==1 || k==0){
                len=right-left+1;
                maxLen=Math.max(maxLen,len);
            }
            right++;
        }

        return maxLen;
    }

    private static boolean isValidMap(HashMap<Character, Integer> map, int k) {

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==k)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
     String s="AABABBA";
     int k=1;
     System.out.println(characterReplacements(s,k));
     System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k) {
        int left=0,right=0,maxLen=0,maxFreq=0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        while (right<n){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxFreq=Math.max(maxFreq,map.get(s.charAt(right)));
            if ((right-left+1)-maxFreq>k){
                char ch=s.charAt(left);
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==0)
                    map.remove(ch);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}
