package Contest;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallestPalindromic {
    public static String smallestPalindrome(String s) {
        ArrayDeque<Character> deque=new ArrayDeque<>();
        char[] ch=s.toCharArray();
        if (s.length()==1)
            return s;
        if (s.length()%2==1)
            return findSmallestPalindrome(s,deque,ch);

        Arrays.sort(ch);
        deque.add(ch[ch.length-1]);
        int count=0;
        for (int i = ch.length-2; i >= 0; i--) {
            if (count%2==0){
                deque.addFirst(ch[i]);
                count++;
            }else {
                deque.addLast(ch[i]);
                count++;
            }
        }
        StringBuilder str=new StringBuilder();
        while (!deque.isEmpty()){
            str.append(deque.poll());
        }

        return checkPalindromes(str.toString())?str.toString():s;
    }

    private static String findSmallestPalindrome(String s,ArrayDeque<Character> deque,char[] ch) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (Character chars:s.toCharArray()){
            map.put(chars,map.getOrDefault(chars,0)+1);
        }
        char temp=' ';
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()%2==1){
                deque.add(entry.getKey());
                temp=entry.getKey();
                break;
            }
        }
        Arrays.sort(ch);
        System.out.println(ch);
        int count=0;
        boolean flag=true;
        for (int i = ch.length-1; i >= 0; i--) {
            if (ch[i]==temp&&flag) {
                flag = false;
                continue;
            }
            if (count%2==0){
                deque.addFirst(ch[i]);
                count++;
            }else {
                deque.addLast(ch[i]);
                count++;
            }
        }
        StringBuilder str=new StringBuilder();
        while (!deque.isEmpty()){
            str.append(deque.poll());
        }

        return checkPalindromes(str.toString())?str.toString():s;

    }

    private static boolean checkPalindromes(String string) {

        int left=0;
        int right=string.length()-1;
        while (left<right){
            if (string.charAt(left)!=string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="rpjnnnjpr";
        System.out.println(smallestPalindrome(str));
    }
}
