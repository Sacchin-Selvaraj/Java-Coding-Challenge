package Java_Program;

import java.util.HashSet;

public class ConsistentStrings {

    public static int toCount(String allowed,String[] words){
        int count=0;
        HashSet<Character> set=new HashSet<>();

        for (char temp:allowed.toCharArray()){
            set.add(temp);
        }
        for (String word:words) {
            int flag=1;
            for (int i = 0; i < word.length(); i++) {
                if(!set.contains(word.charAt(i))){
                    flag=0;
                    break;
                }

            }
            count+=flag;
        }

        return count;
    }

    public static void main(String[] args) {

        String allowed="abc";
        String[] words={"a","b","c","ab","bcd"};

        System.out.println(toCount(allowed,words));

    }
}
