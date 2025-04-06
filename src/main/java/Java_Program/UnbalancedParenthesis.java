package Java_Program;

import java.util.HashSet;
import java.util.Stack;

public class UnbalancedParenthesis {

    private static String removeUnbalancedparenthesis(String str) {

        StringBuilder stringBuilder=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch=='('){
                stack.push(i);
            } else if (ch==')') {
                if (stack.isEmpty())
                    set.add(i);
                else
                    stack.pop();
            }
        }
        while (!stack.isEmpty()){
            set.add(stack.pop());
        }
        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(i)){
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        String str="(((ab";
        System.out.println(removeUnbalancedparenthesis(str));
    }
}
