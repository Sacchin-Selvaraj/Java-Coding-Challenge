package Java_Program;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {


    public static List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();
        String[] num2={"a","b","c"};
        String[] num3={"d","e","f"};


        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num3.length; j++) {
                String temp=num2[i].concat(num3[j]);
                list.add(temp);

            }

        }

        return list;

    }

    public static void main(String[] args) {
        String num="23";
        System.out.println(letterCombinations(num));


    }
}
