package TwoPointer_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubStringWithAllthreeCharacters {

    public static int numberOfSubstrings(String s) {
        int right = 0, subString = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            map.put(s.charAt(right),right);
            if (map.size() == 3) {
                subString+=findMinimum(map)+1;
            }
            right++;
        }
        return subString;
    }

    private static int findMinimum(HashMap<Character, Integer> map) {
        int min=Integer.MAX_VALUE;
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            min=Math.min(min,entry.getValue());
        }
        return min;
    }

    public static int numberOfSubstringsO(String s) {
        int[] lastSeen=new int[3];
        lastSeen[0] = -1;
        lastSeen[1] = -1;
        lastSeen[2] = -1;
        int cnt=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            lastSeen[s.charAt(i) - 'a'] = i;
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                cnt += 1 + Math.min(Math.min(lastSeen[0], lastSeen[1]), lastSeen[2]);

            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
        System.out.println(numberOfSubstringsO(s));
    }
}
