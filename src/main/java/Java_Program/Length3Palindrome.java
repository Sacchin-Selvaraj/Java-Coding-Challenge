package Java_Program;

import java.util.HashSet;
import java.util.Iterator;

public class Length3Palindrome {
    public static int countPalindromicSubsequence(String s) {

        HashSet<Character> hashSet=new HashSet<>();
        HashSet<Character> charSet=new HashSet<>();
        int count=0;
        for (Character c: s.toCharArray()){
            hashSet.add(c);
        }
        for (char c:hashSet){
            int start=s.indexOf(c);
            int end=s.lastIndexOf(c);
            for (int i = start+1; i < end; i++) {
                if(charSet.add(s.charAt(i)))
                     count++;
            }
            charSet.clear();
        }

        return count;
    }

    public static void main(String[] args) {
        String s="bbcbaba";
        System.out.println(countPalindromicSubsequence(s));
    }
}
