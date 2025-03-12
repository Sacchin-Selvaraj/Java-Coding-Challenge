package Java_Program;

import java.util.*;

public class RankTeam {
    public static String rankTeams(String[] votes) {

        HashMap<Character,int[]> map=new HashMap<>();
        int l = votes[0].length();
        for (String vote:votes){
            for (int i = 0; i < vote.length(); i++) {
                map.putIfAbsent(vote.charAt(i),new int[vote.length()]);
                map.get(vote.charAt(i))[i]++;
            }
        }
        List<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a, b) ->{
            for(int i = 0; i < l; i++){
            if(map.get(a)[i] != map.get(b)[i]){
                return map.get(b)[i] - map.get(a)[i];
            }
        }
        return a - b;
        } );
        StringBuilder builder=new StringBuilder();
        for (Character c: list){
            builder.append(c);
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        String[] votes={"ABC","ACB","ABC","ACB","ACB"};
        System.out.println(rankTeams(votes));
    }
}
