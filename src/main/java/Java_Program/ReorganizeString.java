package Java_Program;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReorganizeString {
    public static String reorganizeString(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for (Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character,Integer>> list=map.entrySet().stream()
                .sorted(Map.Entry.<Character,Integer>comparingByValue().reversed()).toList();

        for (Map.Entry<Character,Integer> entry:list){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        return null;
    }

    public static void main(String[] args) {
        String str="aabcdd";
        System.out.println(reorganizeString(str));
    }
}