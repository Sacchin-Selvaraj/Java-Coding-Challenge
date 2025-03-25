package Java_Program;

import java.util.LinkedList;
import java.util.List;

public class StoneGame {

    public static boolean stoneGame(int[] piles) {
        List<Integer> list=new LinkedList<>();
        for (int num:piles){
            list.add(num);
        }

        System.out.println(list);
        return false;

    }
    public static void main(String[] args) {

        int[] stones={3,7,2,3};
        System.out.println(stoneGame(stones));
    }
}
