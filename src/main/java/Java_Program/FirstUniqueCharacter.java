package Java_Program;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstUniqueCharacter {

    public static Character findUnique(String s){
        int[] a=new int[26];
        char[] c=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            a[c[i]-'a']++;
        }
        char res=' ';
        for (int i = 0; i < a.length; i++) {
            if(a[i]==1){
                res = (char) ('a'+ i);
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="sacchinsa";
        System.out.println(findUnique(s));
    }
}
