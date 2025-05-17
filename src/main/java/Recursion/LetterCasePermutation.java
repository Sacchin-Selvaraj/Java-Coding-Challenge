package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList<>();
        lettercaseRecursion(result,0,s.toCharArray(),s.length());
        return result;
    }

    private static void lettercaseRecursion(List<String> result, int idx, char[] words, int length) {
        if (idx==length){
            StringBuilder st=new StringBuilder();
            for (char ch:words){
                st.append(ch);
            }
            result.add(st.toString());
            return;
        }
        if (Character.isDigit(words[idx])){
            lettercaseRecursion(result,idx+1,words,length);
            return;
        }
        words[idx]=Character.toUpperCase(words[idx]);
        lettercaseRecursion(result, idx+1, words, length);
        words[idx]=Character.toLowerCase(words[idx]);
        lettercaseRecursion(result, idx+1, words, length);
    }

    public static void main(String[] args) {
        String s="abcd";
        System.out.println(letterCasePermutation(s));
    }
}
