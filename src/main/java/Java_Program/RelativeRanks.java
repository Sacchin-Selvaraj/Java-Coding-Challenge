package Java_Program;

import java.util.*;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {

        int[] copiedArray = Arrays.copyOf(score,score.length);
        HashMap<Integer,String> map=new HashMap<>();
        List<Integer> list= Arrays.stream(copiedArray).boxed().sorted(Comparator.reverseOrder()).toList();
        int i=1;
        for (int num:list){
            map.put(num,findMedalName(i));
            i++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> score[b] - score[a]);
        for (int k = 0; k < score.length; k++) {
            pq.add(k);
        }
        System.out.println(pq);
        String[] str=new String[score.length];
        for (int j = 0; j < score.length; j++) {
            String value=map.get(score[j]);
            str[j]=value;
        }
        return str;
    }

    private static String findMedalName(int i) {

        return switch (i) {
            case 1 -> "Gold Medal";
            case 2 -> "Silver Medal";
            case 3 -> "Bronze Medal";
            default -> String.valueOf(i);
        };
    }

    public static void main(String[] args) {
        int[] score={10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
