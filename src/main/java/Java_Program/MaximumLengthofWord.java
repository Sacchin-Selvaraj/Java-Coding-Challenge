package Java_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthofWord {

    public static int maxProduct(String[] words) {

        List<Set<Character>> list = new ArrayList<>();
        for (String word : words) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                set.add(word.charAt(i));
            }
            list.add(set);
        }
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            Set<Character> set1 = list.get(i);
            for (int j = i + 1; j < words.length - 1; j++) {
                boolean res = false;
                Set<Character> set2 = list.get(j);
                for (char c :set1) {
                    if (set2.contains(c)) {
                        res = true;
                        break;
                    }
                }
                if (!res) {
                    max = Math.max(max, words[i].length()*words[j].length());
                }

            }
        }
        return max;
    }

    public static void main(String[] args) {

        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.println(maxProduct(words));
    }
}
