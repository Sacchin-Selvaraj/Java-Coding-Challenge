package Java_Program;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseSubStrings {

    public static String reverseParentheses(String s) {
        Deque<Integer> deque=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        for (char c: s.toCharArray()){
            if(c=='('){
                deque.push(res.length());
                System.out.println("deque"+deque);
            } else if (c==')') {
                int start=deque.pop();
                String rev=new StringBuilder(res.substring(start)).reverse().toString();
                res.replace(start,res.length(),rev);
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s="(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));

    }
}
