package CommonQuestions;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

    public static void main(String[] args) {

        String str="abcabcabb"; // 4

        int n=str.length()-1;

        int longest;
        int maxLongest=Integer.MIN_VALUE;

        int left=0;
        int right=0;
        List<Character> list=new ArrayList<>();

        while(right<=n){
            char ch=str.charAt(right);

            while(list.contains(ch)){
                list.removeFirst();
                left++;
            }

            list.add(ch);
            longest=right-left+1;

            if(longest>maxLongest){
                maxLongest=list.size();
            }

            right++;
        }

        System.out.println(maxLongest);
    }
}
