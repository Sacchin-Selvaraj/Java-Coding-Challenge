package Contest;

import java.util.Stack;

public class ResultingStrings {
    public static String resultingString(String s) {

        Stack<Character> st=new Stack<>();
        for (char ch:s.toCharArray()){
            int count=0;
            if (!st.isEmpty() && isResultingString(ch,st)){
                st.pop();
                count++;
            }
            if (count==0)
                st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st) ans.append(ch);
        return ans.toString();
    }

    private static boolean isResultingString(char ch, Stack<Character> st) {

        char stackCharacter=st.peek();
        char nextChar = (char) (stackCharacter == 'z' ? 'a' : stackCharacter + 1);
        char prevChar = (char) (stackCharacter == 'a' ? 'z' : stackCharacter - 1);
        if ((nextChar==ch) || prevChar==ch)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s="zadb";
        System.out.println(resultingString(s));
    }
}
