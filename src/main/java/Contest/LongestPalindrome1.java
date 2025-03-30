package Contest;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome1 {

    public static int longestPalindrome(String s, String t) {

        int max=-1;
        List<String> s1=findSubstring(s);
        List<String> t1=findSubstring(t);
        System.out.println(s1);
        System.out.println(t1);
        for (int i = 0; i < s1.size(); i++) {
            for (int j = 0; j < t1.size(); j++) {
                String word=s1.get(i).concat(t1.get(j));
                if (checkPalindrome(word)){
                    int len=word.length();
                    if (len>max)
                        max=len;
                }
                if (checkPalindrome(t1.get(j))){
                    int len=t1.get(j).length();
                    if (len>max)
                        max=len;
                }
            }
            if (checkPalindrome(s1.get(i))){
                int len=s1.get(i).length();
                if (len>max)
                    max=len;
            }
        }
        if (max==-1)
            return 1;
        return max;
    }

    private static boolean checkPalindrome(String word) {
        int left=0;
        int right=word.length()-1;
        while (left<=right){
            if (word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void findSubstrings(String str, int left, int right, List<String> list) {
        if (left >= str.length()) {
            return;
        }
        if (right < left) {
            findSubstrings(str, left + 1, str.length() - 1, list);
            return;
        }
        String substring = str.substring(left, right + 1);
        list.add(substring);
        findSubstrings(str, left, right - 1,list);
    }
    public static List<String> findSubstring(String str) {
        List<String> list = new ArrayList<>();
        findSubstrings(str, 0, str.length() - 1,list);
        return list;
    }

    public static void main(String[] args) {
        String s="abc";
        String t="def";
        System.out.println(longestPalindrome(s,t));
    }
}
