package Java_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KeyboardRow {

    public static String[] findWords(String[] words) {

        int[] rows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List<String> list=new ArrayList<>();
        for (String word:words){
            String word1=word.toLowerCase();
            int row=rows[word1.charAt(0)-'a'];
            boolean flag=true;
            for (int i = 1; i < word1.length(); i++) {
                if (rows[word1.charAt(i)-'a']!=row){
                    flag=false;
                    break;
                }
            }
            if (flag)
                list.add(word);
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words={"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}
