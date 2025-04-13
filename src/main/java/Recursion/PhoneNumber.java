package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if (digits.isEmpty())
            return list;

        HashMap<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        findCombinations(list,new StringBuilder(),digitToLetters,digits,0);
        return list;
    }

    private void findCombinations(List<String> list, StringBuilder stringBuilder, HashMap<Character, String> digitToLetters, String digits,int idx) {
        if (idx==digits.length()){
            list.add(stringBuilder.toString());
            return;
        }
        String letters=digitToLetters.get(digits.charAt(idx));
        for (char ch:letters.toCharArray()){
            stringBuilder.append(ch);
            findCombinations(list,stringBuilder,digitToLetters,digits,idx+1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }

    public static void main(String[] args) {
        String str="23";
        PhoneNumber obj=new PhoneNumber();
        System.out.println(obj.letterCombinations(str));
    }
}
