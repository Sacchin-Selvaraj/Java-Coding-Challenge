package Java_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthofWord {

    public static int maxProduct(String[] words) {

//        List<Set<Character>> list = new ArrayList<>();
//        for (String word : words) {
//            Set<Character> set = new HashSet<>();
//            for (int i = 0; i < word.length(); i++) {
//                set.add(word.charAt(i));
//            }
//            list.add(set);
//        }
//        int max = 0;
//        for (int i = 0; i < words.length; i++) {
//            Set<Character> set1 = list.get(i);
//            for (int j = i + 1; j < words.length - 1; j++) {
//                boolean res = false;
//                Set<Character> set2 = list.get(j);
//                for (char c :set1) {
//                    if (set2.contains(c)) {
//                        res = true;
//                        break;
//                    }
//                }
//                if (!res) {
//                    max = Math.max(max, words[i].length()*words[j].length());
//                }
//            }
//        }
//        return max;
            if (words == null || words.length == 0)
                return 0;
            int len = words.length;
            int[] value = new int[len];
            for (int i = 0; i < len; i++) {
                String tmp = words[i];
                value[i] = 0;
                for (int j = 0; j < tmp.length(); j++) {
                    value[i] |= 1 << (tmp.charAt(j) - 'a');
                }
            }
            int maxProduct = 0;
            for (int i = 0; i < len; i++)
                for (int j = i + 1; j < len; j++) {
                    if ((value[i] & value[j]) == 0 && (words[i].length() * words[j].length() > maxProduct))
                        maxProduct = words[i].length() * words[j].length();
                }
            return maxProduct;
        }

    public static void main(String[] args) {

        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.println(maxProduct(words));
    }
}
