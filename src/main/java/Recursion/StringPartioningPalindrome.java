package Recursion;

import java.util.ArrayList;
import java.util.List;


public class StringPartioningPalindrome {

    public static void main(String[] args) {

        String s = "abc";
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        partioningString(res, list, 0, s);
        System.out.println(res);
    }

    private static void partioningString(List<List<String>> res, List<String> list, int idx, String s) {

        if (idx == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < s.length(); i++) {
            if (isPalindromeCheck(s,idx,i)){
                list.add(s.substring(idx,i+1));
                partioningString(res, list, i+1, s);
                list.removeLast();
            }
        }
    }

    private static boolean isPalindromeCheck(String s, int start, int end) {

        while (start<=end){
            if (s.charAt(start)!=s.charAt(end))
                return false;
            end--;
            start++;
        }
        return true;
    }
}
