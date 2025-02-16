package Java_Program;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class ShortestMatchingSubstring {

    public static int shortestMatchingSubstring(String s, String p) {

       ArrayDeque<Character> deque1=new ArrayDeque<>();
       ArrayDeque<Character>deque2=new ArrayDeque<>();
       for (Character c:s.toCharArray()){
           deque1.add(c);
       }
       for (Character ch:p.toCharArray()){
           deque2.add(ch);
       }
       int count=0;
        for (int i = 0; i < s.length(); i++) {

            if (deque2.peek().equals('*')){
                deque1.poll();
                deque2.poll();
                count++;
                continue;
            }
            if (deque1.peek().equals(deque2.peek())){
                deque1.poll();
                deque2.poll();
                count++;
                continue;
            }
            deque1.poll();
        }
        return count;
    }


    public static void main(String[] args) {
        String s="abaacbaecebce";
        String p="ba*c*ce";
        System.out.println(shortestMatchingSubstring(s,p));

    }
}
