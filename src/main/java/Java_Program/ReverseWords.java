package Java_Program;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {

    public static String reverseWords(String s) {

        s=s.trim();
        String[] str=s.split("\\s+");
        System.out.println(Arrays.toString(str));
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = str.length-1; i >= 0 ; i--) {
            if (i==str.length-1) {
                stringBuilder.append(str[i]);
            }else {
                stringBuilder.append(" ");
                stringBuilder.append(str[i]);
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s="  hello world  ";
        System.out.println(reverseWords(s));
    }
}
