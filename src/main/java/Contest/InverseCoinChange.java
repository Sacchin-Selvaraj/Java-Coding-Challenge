package Contest;

import java.util.ArrayList;
import java.util.List;

public class InverseCoinChange {

    public static List<Integer> findCoins(int[] nums) {
        int n = nums.length;
        long[] ways = new long[n + 1];
        ways[0] = 1;
        List<Integer> coins = new ArrayList<>();

        for (int a = 1; a <= n; a++) {
            long want = nums[a - 1];
            long have = ways[a];
            long dif = want - have;

            if (have > want) return new ArrayList<>();
            if (have == want) continue;
            if (dif != 1) return new ArrayList<>();

            coins.add(a);
            for (int j = a; j <= n; j++) {
                ways[j] += ways[j - a];
            }
        }

        return coins;
    }

    public static void main(String[] args) {
        int[] numWays={0,1,0,2,0,3,0,4,0,5};
        System.out.println(findCoins(numWays));
    }
}
