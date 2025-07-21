package Contest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;


class Network {
    int first;
    int sum;
    int weight;

    public Network(int first, int second, int weight) {
        this.first = first;
        this.sum = second;
        this.weight = weight;
    }
}

public class NetworkRecoveryPath {

    public static int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        ArrayList<ArrayList<int[]>> adjlist = new ArrayList<>();
        int n = 0;
        for (int[] edge:edges){
            n=Math.max(n,edge[1]);
        }
        for (int i = 0; i <= n; i++) {
            adjlist.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int first = edge[0];
            int second = edge[1];
            int weight = edge[2];
            adjlist.get(first).add(new int[]{second, weight});
        }
        Queue<Network> queue = new ArrayDeque<>();
        queue.add(new Network(0, 0, Integer.MAX_VALUE));
        int maxWeight = -1;

        while (!queue.isEmpty()) {
            Network path = queue.poll();
            int node = path.first;
            int sumNode = path.sum;
            int weight = path.weight;
            if (!online[node]) {
                continue;
            }
            if (node == n && sumNode<=k) {
                maxWeight = Math.max(maxWeight, weight);
            }
            for (int[] nextPath : adjlist.get(node)) {
                int nextAdjnode = nextPath[0];
                int nextWeight = nextPath[1];
                int minWeight = Math.min(weight, nextWeight);
                int sum=sumNode+nextWeight;
                queue.add(new Network(nextAdjnode,sum,minWeight));

            }
        }
        return (maxWeight==Integer.MAX_VALUE)? -1:maxWeight;
    }

    public static void main(String[] args) {
        int[][] edges = {
//                {0, 1, 7},
//                {1, 4, 5},
//                {0, 2, 6},
//                {2, 3, 6},
//                {3, 4, 2},
//                {2, 4, 6}
                {0,1,8}
        };
        boolean[] online = {true, true};
        int k = 11;
        System.out.println(findMaxPathScore(edges, online, k));
    }
}
