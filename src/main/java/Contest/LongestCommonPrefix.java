package Contest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static int[] longestCommonPrefix(String[] words, int k) {

        int[] res=new int[words.length];
        HashMap<String,Integer> map=new HashMap<>();
        for (String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (int i = 0; i < words.length; i++) {
            res[i]=calculatelength(map,words[i],k);
        }
        return res;
    }

    private static int calculatelength(HashMap<String, Integer> map, String word, int k) {
        if (word.length() < k) return -1;
        int max=0;
        int temp=0;
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            if (word.equals(entry.getKey())){
                if (entry.getValue()-1>=k){
                    temp=entry.getKey().length();
                    if (temp>max)
                        max=temp;
                }
            } else{
                if (entry.getValue()>=k){
                    temp=entry.getKey().length();
                    if (temp>max)
                        max=temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[]words={"jump","run","run","jump","run"};
        System.out.println(Arrays.toString(longestCommonPrefix(words,2)));
    }
}
