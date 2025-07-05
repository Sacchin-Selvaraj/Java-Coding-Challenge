package Graph;

import java.util.*;

public class MinimumTimeInDirectedGraph {
    public static int minTime(int n, int[][] edges) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], start = edge[2], end = edge[3];
            graph.get(u).add(new int[]{v, start, end});
        }

        // Min-heap: (time, node)
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[]{0, 0});

        // Visited array to store the earliest arrival time at each node
        int[] visited = new int[n];
        Arrays.fill(visited, Integer.MAX_VALUE);
        visited[0] = 0;

        while (!heap.isEmpty()) {
            int[] current = heap.poll();
            int time = current[0], node = current[1];

            if (node == n - 1) {
                return time;
            }

            if (time > visited[node]) {
                continue;
            }

            // Option 1: Wait at the current node
            if (time + 1 < visited[node]) {
                visited[node] = time + 1;
                heap.offer(new int[]{time + 1, node});
            }

            // Option 2: Travel along outgoing edges
            for (int[] edge : graph.get(node)) {
                int v = edge[0], start = edge[1], end = edge[2];
                if (time > end) {
                    continue; // Cannot use this edge anymore
                }
                int departureTime = Math.max(time, start);
                if (departureTime + 1 < visited[v]) {
                    visited[v] = departureTime + 1;
                    heap.offer(new int[]{departureTime + 1, v});
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] edges={{0,1,0,1},{1,2,2,5}};
        System.out.println(minTime(n,edges));
    }
}
