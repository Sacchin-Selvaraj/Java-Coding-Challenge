package Java_Program;

import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static String reorganizeString(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder str=new StringBuilder();
        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        queue.addAll(map.keySet());
        while (queue.size() >= 2) {

            char c1 = queue.poll();
            char c2 = queue.poll();

            str.append(c1);
            str.append(c2);

            map.put(c1,map.get(c1)-1);
            map.put(c2,map.get(c2)-1);

            if (map.get(c1)>0) queue.add(c1);
            if (map.get(c2)>0) queue.add(c2);

        }

        if (!queue.isEmpty()){
            char c1=queue.poll();
            if (map.get(c1)>1) return "";

            str.append(c1);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String str = "aabcdd";
        System.out.println(reorganizeString(str));
    }
}