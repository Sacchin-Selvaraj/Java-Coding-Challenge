package Java_Program;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class CountOccurances {

    public static boolean areOccurrencesEqual(String s) {
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (Character c : s.toCharArray()) {
            hashtable.put(c, hashtable.getOrDefault(c, 0) + 1);
        }
        System.out.println(hashtable);
        boolean res=true;
        for (int i = 0; i < s.length(); i++) {
            int n=hashtable.get(s.charAt(i));
            if(n%2!=0){
                res=false;
            }
        }
        System.out.println(hashtable.keySet());
        return res;
    }
    public static void main(String[] args) {
        String s = "Sacchin";
        System.out.println(areOccurrencesEqual(s));
        System.out.println();
        System.out.println("Occurance : "+ occuranceCharacter(s,'c'));
    }

    private static long occuranceCharacter(String s, char a) {

        return s.chars().filter(ch-> ch==a).count();

    }




}
