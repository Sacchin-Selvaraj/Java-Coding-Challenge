package Contest;

import java.util.*;

public class NumberOfNonIntersectingSubStrings {
//    public static int maxSubstrings(String word) {
//        if (word.length()<4)
//            return 0;
//        List<List<Integer>> list=new ArrayList<>();
//        for (int i = 0; i < word.length(); i++) {
//            for (int j = i+1; j < word.length(); j++) {
//                if (word.charAt(i)==word.charAt(j) && j-i+1>=4){
//                    list.add(List.of(i,j));
//                    break;
//                }
//            }
//
//        }
//        int count=1;
//        if (list.isEmpty())
//            return 0;
//        if (list.size()==1)
//            return 1;
//        int end=list.getFirst().get(1);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(i).get(0)>end){
//                count++;
//                end=list.get(i).get(1);
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        String s="aabececbbeccdcdcbbdece";
        System.out.println(maxSubstrings(s));
    }

    public static int maxSubstrings(String word) {
        if (word.length() < 4) {
            return 0;
        }
        HashMap<Character, TreeSet<Integer>> map=new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if (!map.containsKey(ch)){
                map.put(ch,new TreeSet<>());
            }
            map.get(ch).add(i);
        }
        List<int[]> list=new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            TreeSet<Integer> set=map.get(word.charAt(i));

            Integer end=set.ceiling(i+3);
            if (end!=null){
                list.add(new int[]{i,end});
            }
        }
        Collections.sort(list,(o1, o2) ->
                o1[1]-o2[1]);
        int count=0;
        int lastEnd=-1;
        for (int[] num:list){
            if (num[0]>lastEnd){
                count++;
                lastEnd=num[1];
            }
        }

        return count;
    }

}
