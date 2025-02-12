package CommonQuestions;

import java.util.*;

public class FindFirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "SacchinS";

        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }

}
