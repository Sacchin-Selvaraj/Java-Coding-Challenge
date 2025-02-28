package Java_Program;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int substring(String str){
        Set<Character> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=0;
        while (right<str.length()){
            Character c=str.charAt(right);

            if (!set.contains(c)){
                set.add(c);
                right++;
                max=Math.max(max,right-left);
            }else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        String str="abcabcabb";
        System.out.println(substring(str));

    }
}
