package CommonQuestions;

import java.util.HashSet;

public class LongestUniqueSubString {

    public static void main(String[] args) {
        String str="abcabccbb";
        System.out.println(findLongestSubString(str));
    }

    private static int findLongestSubString(String str) {
        int max=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
          while (set.contains(str.charAt(i))){
              set.remove(str.charAt(left));
              left++;
          }
          set.add(str.charAt(i));
          max=Math.max(max,i-left+1);

        }
        return max;
    }
}
