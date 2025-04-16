package Java_Program;

import java.util.LinkedHashSet;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str="sacchinsa";
        System.out.println(findNonRepeating(str));
    }

    private static String findNonRepeating(String str) {

        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (Character ch:str.toCharArray()){
            if (set.add(ch)){

            }else {
                set.remove(ch);
            }
        }
        System.out.println(set.getFirst());
        return " ";
    }
}
