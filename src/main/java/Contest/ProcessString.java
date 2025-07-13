package Contest;

import java.util.*;

public class ProcessString {
    public static String processStrs(String s) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (Character.isAlphabetic(ch)){
                str.append(ch);
            } else if (ch=='*') {
                if (!str.isEmpty()){
                    str.deleteCharAt(str.length()-1);
                }
            } else if (ch=='#') {
                String duplicate=str.toString();
                str.append(duplicate);
            }else {
                str.reverse();
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s="%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#";
        System.out.println(processStr(s,3));
    }
    public static char processStr(String s,long k) {
        List<Character> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                result.add(c);
            } else if (c == '*' && !result.isEmpty()) {
                result.remove(result.size() - 1);
            } else if (c == '#') {
                int size = result.size();
                for (int j = 0; j < size; j++) {
                    result.add(result.get(j));
                }
            } else if (c == '%') {
                reverseList(result);
            }

            // Early termination if we've built enough characters
            if (result.size() >= k) {
                break;
            }
        }

        return (k > 0 && k <= result.size()) ? result.get((int) (k - 1)) : '.';

    }
    private static void reverseList(List<Character> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            char temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
