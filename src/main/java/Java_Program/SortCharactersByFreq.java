package Java_Program;


import java.util.*;

public class SortCharactersByFreq {

    public static String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder str=new StringBuilder();

        for (Character c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        for (Map.Entry<Character,Integer> entry:list){
            char ch=entry.getKey();
            int i=entry.getValue();
            while (i>0){
                str.append(ch);
                i--;
            }

        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s="Aabb";
        System.out.println(frequencySort(s));

    }
}
