package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        findParenthesis(0,0,list,"",n);
        return list;
    }

    private static void findParenthesis(int openP, int closedP, List<String> list,String str, int n) {
        if (openP==closedP && openP+closedP==n*2) {
            list.add(str);
            return;
        }
        if (openP<n){
            findParenthesis(openP+1,closedP,list,str+"(",n);
        }
        if (closedP<openP){
            findParenthesis(openP,closedP+1,list,str+")",n);
        }

    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(generateParenthesis(n));
    }
}
