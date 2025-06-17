package Java_Program;

import java.util.ArrayList;
import java.util.List;

public class FindTheSequenceOfProgram {
    public static List<String> stringSequence(String target) {
        List<String> stringList=new ArrayList<>();
        for (int i = 0; i < target.length(); i++) {
            String s=target.substring(0,i+1);
            for (char j = 'a'; j <='z'; j++) {
                StringBuilder value= new StringBuilder(target.substring(0, i));
                value.append(j);
                stringList.add(value.toString());
                if (s.equals(value.toString())){
                    break;
                }
            }
        }
        return stringList;
    }

    public static void main(String[] args) {
        String target="he";
        System.out.println(stringSequence(target));
    }
}
