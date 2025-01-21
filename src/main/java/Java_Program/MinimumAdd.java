package Java_Program;

import java.util.Stack;

public class MinimumAdd {

    public static int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
           if(stack.isEmpty())
               stack.push(c);
           else if (stack.peek()=='('&&c==')') {
               stack.pop();
           }
           else {
               stack.push(c);
           }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String s = "())";
        System.out.println(minAddToMakeValid(s));
    }
}
