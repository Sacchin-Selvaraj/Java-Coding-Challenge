package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class DistancePair{
    int distance;
    int node;

    public DistancePair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}
public class DijkstraPriorityQueue {

    private static int[] findShortestDistance(int nodes, int[][] edges, int srcNode) {
        ArrayList<ArrayList<DistancePair>> adjList=constructAdjList(edges,nodes);
        int[] distance=new int[nodes];
        Arrays.fill(distance, (int) 1e9);
        distance[srcNode]=0;

        PriorityQueue<DistancePair> queue=new PriorityQueue<>((a, b) -> a.distance-b.distance);
        queue.add(new DistancePair(0,srcNode));

        while (!queue.isEmpty()){
            DistancePair pair=queue.poll();
            int dist=pair.distance;
            int node=pair.node;
            for (DistancePair keyPair:adjList.get(node)){
                int wt=keyPair.distance;
                int adjNode=keyPair.node;
                if (dist+wt<distance[adjNode]){
                    distance[adjNode]=dist+wt;
                    queue.add(new DistancePair(dist+wt,adjNode));
                }
            }
        }
        return distance;
    }

    private static ArrayList<ArrayList<DistancePair>> constructAdjList(int[][] edges,int nodes) {
        ArrayList<ArrayList<DistancePair>> adjList=new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];  // Source node
            int v = edge[1];  // Destination node
            int wt = edge[2];  // Weight
            adjList.get(u).add(new DistancePair(wt, v));
            adjList.get(v).add(new DistancePair(wt, u));  // Add reverse edge for undirected graphs
        }
        return adjList;
    }

    public static void main(String[] args) {
        int nodes = 6;
        int[][] edges={
                {0,1,4},
                {0,2,4},
                {1,0,4},
                {1,2,2},
                {2,0,4},
                {2,1,2},
                {2,3,3},
                {2,4,1},
                {2,5,6},
                {3,2,3},
                {3,5,2},
                {4,2,1},
                {4,5,3},
                {5,2,6},
                {5,3,2},
                {5,4,3}
        };
        int srcNode=5;
        System.out.println(Arrays.toString(findShortestDistance(nodes,edges,srcNode)));
    }
}
