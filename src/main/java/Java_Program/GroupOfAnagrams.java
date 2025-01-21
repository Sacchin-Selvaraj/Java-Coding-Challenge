package Java_Program;

import java.util.*;

public class GroupOfAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,Integer>map=new HashMap<>();
        List<List<String>> a = new ArrayList<>();
        for (String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String temp=new String(ch);
            if(map.containsKey(temp)){
                a.get(map.get(temp)).add(str);
            }else{
                map.put(temp,a.size());
                a.add(new ArrayList<>(List.of(str)));
            }
        }
        return a;
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
