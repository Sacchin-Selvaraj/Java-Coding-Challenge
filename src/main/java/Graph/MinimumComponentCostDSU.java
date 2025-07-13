package Graph;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumComponentCostDSU {

    static class UnionFind {
        private int[] parent;
        private int[] rank;

        public UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int u) {
            if (parent[u] != u) {
                parent[u] = find(parent[u]); // Path compression
            }
            return parent[u];
        }

        public boolean union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);
            if (rootU == rootV) {
                return false; // Already connected
            }
            // Union by rank
            if (rank[rootU] > rank[rootV]) {
                parent[rootV] = rootU;
            } else if (rank[rootU] < rank[rootV]) {
                parent[rootU] = rootV;
            } else {
                parent[rootV] = rootU;
                rank[rootU]++;
            }
            return true;
        }
}
        public static int minCost(int n, int[][] edges, int k) {
        if (edges.length == 0) return 0;

        // Sort edges by weight in ascending order
        Arrays.sort(edges, Comparator.comparingInt(a -> a[2]));

        int left = 0;
        int right = edges[edges.length - 1][2];
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            UnionFind uf = new UnionFind(n);
            int components = n;

            for (int[] edge : edges) {
                if (edge[2] > mid) {
                    continue; // Skip edges heavier than current mid
                }
                if (uf.union(edge[0], edge[1])) {
                    components--;
                }
            }

            if (components <= k) {
                result = mid;
                right = mid - 1; // Try for a smaller max cost
            } else {
                left = mid + 1; // Need to allow higher edge weights
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int n=5;
        int[][] edges={
                {0,1,4},
                {1,2,3},
                {1,3,2},
                {3,4,6}
        };
        int k=2;
        System.out.println(minCost(n,edges,k));
    }
}
