package Greedy;

public class ValidParenthesisString {

    public static boolean checkValidStrings(String s) {
        return validString(s, 0, 0);
    }

    private static boolean validString(String s, int baseCase, int count) {
        if (count<0)
            return false;
        if (baseCase >= s.length()) {
            return count == 0;
        }
        if (s.charAt(baseCase) == '(') {
            return validString(s, baseCase + 1, count + 1);
        } else if (s.charAt(baseCase) == ')') {
            return validString(s, baseCase + 1, count - 1);
        } else {
           return validString(s, baseCase + 1, count + 1) || validString(s, baseCase + 1, count - 1)
                   || validString(s, baseCase + 1, count);
        }
    }

    public static void main(String[] args) {

        String s = "(**)";
        System.out.println(checkValidStrings(s));
        System.out.println(checkValidString(s));
    }

    // Optimal Solution O(n)
    private static boolean checkValidString(String s) {
        int cmin=0,cmax=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                cmax++;
                cmin++;
            } else if (s.charAt(i)==')') {
                cmax--;
                cmin--;
            }else {
                cmin--;
                cmax++;
            }
            if (cmin<0) cmin=0;
            if (cmax<0) return false;
        }
        return cmin==0;
    }
}
