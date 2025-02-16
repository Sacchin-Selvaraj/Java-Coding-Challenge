package Java_Program;

import java.util.ArrayDeque;
import java.util.List;

public class SpecialSubString {
    public static boolean hasSpecialSubstring(String s, int k) {

//        ArrayDeque<Character> deque=new ArrayDeque<>();
//        for (int i = 0; i < k; i++) {
//            deque.add(s.charAt(0));
//        }
//        int i=k;
//        while (i<s.length()){
//            if (checkSubstring(deque)){
//                if (!deque.contains(s.charAt(i))){
//                    return true;
//                }else{
//                    deque.poll();
//                    deque.addLast(s.charAt(i));
//                }
//            }else {
//                deque.poll();
//                deque.addLast(s.charAt(i));
//            }
//            i++;
//        }
//        return false;


        int n = s.length();
        for(int i=0; i<=n-k; i++) {
            boolean flag = true;
            if((i==0 || s.charAt(i-1) != s.charAt(i)) && (i+k >= n || s.charAt(i) != s.charAt(i+k))) {
                for(int j=i+1; flag && j<i+k; j++) {
                    if(s.charAt(i) != s.charAt(j)) {
                        flag = false;
                    }
                }
                if(flag) return true;
            }
        }
        return false;
    }

//    private static boolean checkSubstring(ArrayDeque<Character> deque) {
//        char firstChar = deque.peekFirst();
//        boolean value=deque.stream().allMatch(character -> character==firstChar);
//        return value;
//    }

    public static void main(String[] args) {
        String s="abaabcd";
        int k=3;
        System.out.println(hasSpecialSubstring(s,k));
    }
}
