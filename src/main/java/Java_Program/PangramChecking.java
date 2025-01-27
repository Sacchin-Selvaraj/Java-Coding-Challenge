package Java_Program;

import java.sql.SQLOutput;

public class PangramChecking {

    private static boolean checkPanagram(String word){

        int[] res=new int[26];
        word=word.toLowerCase();
        System.out.println(word);
        for (char c:word.toCharArray()){
            res[c-'a']++;
        }
        for (int i:res){
            if(i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String word="QWERTYUIOPLKMJNHGBVGFVCFRDCDSXSA";
        System.out.println("Output: "+checkPanagram(word));
    }
}
