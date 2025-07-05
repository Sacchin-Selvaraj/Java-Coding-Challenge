package Contest;

import java.util.*;

public class MinimumCostPath {

    public static long minCost(int m, int n, int[][] waitCost) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[]{1, 0, 0, 1}); // Start at (0, 0) at time=1

        // Visited: (i, j, time % 2) -> min cost
        Map<String, Integer> visited = new HashMap<>();

        while (!heap.isEmpty()) {
            int[] curr = heap.poll();
            int cost = curr[0], i = curr[1], j = curr[2], time = curr[3];

            // Reached destination
            if (i == m - 1 && j == n - 1) {
                return cost;
            }

            String key = i + "," + j + "," + (time % 2);
            if (visited.containsKey(key) && visited.get(key) <= cost) {
                continue; // Skip if already visited with a lower cost
            }
            visited.put(key, cost);

            if (time % 2 == 1) { // Odd time: Move right or down
                // Move right (i, j + 1)
                if (j + 1 < n) {
                    int newCost = cost + (i + 1) * (j + 2); // Entry cost of (i, j+1)
                    heap.offer(new int[]{newCost, i, j + 1, time + 1});
                }
                // Move down (i + 1, j)
                if (i + 1 < m) {
                    int newCost = cost + (i + 2) * (j + 1); // Entry cost of (i+1, j)
                    heap.offer(new int[]{newCost, i + 1, j, time + 1});
                }
            } else { // Even time: Wait in place
                int newCost = cost + waitCost[i][j];
                heap.offer(new int[]{newCost, i, j, time + 1});
            }
        }
        return -1; // Should not reach here if path exists
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int[][] waitCost = {{1, 2}};
        System.out.println(minCost(m, n, waitCost));
    }
}

