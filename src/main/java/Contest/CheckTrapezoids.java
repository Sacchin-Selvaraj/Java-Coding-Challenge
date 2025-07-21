package Contest;

import java.util.HashMap;
import java.util.Map;

public class CheckTrapezoids {
    private static final int MOD = 1000000007;

    public static int countTrapezoids(int[][] points) {
        Map<Integer, Integer> yCount = new HashMap<>();
        for (int[] point : points) {
            int y = point[1];
            yCount.put(y, yCount.getOrDefault(y, 0) + 1);
        }

        long total = 0;
        long sum = 0;
        for (int cnt : yCount.values()) {
            if (cnt >= 2) {
                long c = (long) cnt * (cnt - 1) / 2;
                total = (total + sum * c) % MOD;
                sum = (sum + c) % MOD;
            }
        }

        return (int) total;
    }

    public static void main(String[] args) {
        int[][] points={
                {1,0},
                {2,0},
                {3,0},
                {2,2},
                {3,2}
        };
        System.out.println(countTrapezoids(points));
    }

}
