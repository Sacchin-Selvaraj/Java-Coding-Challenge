package Contest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class MinimumDiscards {

    static class Pair {
        int type;
        int day;
        Pair(int type, int day) { this.type = type; this.day = day; }
    }

    public static int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int count=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        Deque<Pair> window = new ArrayDeque<>();
        for (int i = 0; i < arrivals.length; i++) {

            int day = i + 1;
            int num = arrivals[i];

            while (!window.isEmpty() && window.peekFirst().day <= day - w) {
                Pair old = window.pollFirst();
                freq.put(old.type, freq.get(old.type) - 1);
            }

            if (freq.getOrDefault(num, 0) >= m) {
                count++;
            } else {
                window.addLast(new Pair(num, day));
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arrivals={1,2,3,3,3,4};
        System.out.println(minArrivalsToDiscard(arrivals,3,2));
    }
}
