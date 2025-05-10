package Contest;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.TreeMap;

public class FindMostFrequencies {

    public static int maxFreqSum(String s) {
        if (s.length()==1)
            return 1;
        int[] arr=new int[26];
        for (char c:s.toCharArray()){
            arr[c-'a']++;
        }
        int vowels=0;
        int constants=0;

        for (int i = 0; i < arr.length; i++) {
            if (i==0||i==4||i==8||i==14||i==20){
                if (arr[i]>vowels){
                    vowels=arr[i];
                }
            }else {
                if (arr[i]>constants){
                    constants=arr[i];
                }
            }

        }
     return vowels+constants;

    }

    public static void main(String[] args) {
        String s="aeiaeia";
        System.out.println(maxFreqSum(s));
    }
}
