package Java_Program;

import java.util.HashSet;
import java.util.Hashtable;

public class CountOccurances {

    public static boolean areOccurrencesEqual(String s) {

        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (Character c : s.toCharArray()) {
            hashtable.put(c, hashtable.getOrDefault(c, 0) + 1);
        }
        System.out.println(hashtable);
        HashSet<Character> set= new HashSet<>();
        for (Character c : s.toCharArray()) {
            set.add(c);
        }
        char[] temp=new char[set.size()];

        for (int i = 0; i < hashtable.size(); i++) {
            int n=hashtable.get()
        }



        return true;
    }

    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }


}
