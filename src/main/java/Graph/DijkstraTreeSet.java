package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


public class DijkstraTreeSet {

    private static int[] findShortestDistanceSet(int nodes, int[][] edges, int srcNode) {
        ArrayList<ArrayList<DistancePair>> adjList=constructAdjList(edges,nodes);

        int[] distance=new int[nodes];
        Arrays.fill(distance,(int) 1e9);
        distance[srcNode]=0;

        TreeSet<DistancePair> set=new TreeSet<>(new Comparator<DistancePair>() {
            @Override
            public int compare(DistancePair a, DistancePair b) {
                if (a.distance!=b.distance)
                    return a.distance-b.distance;
                else
                    return a.node-b.node;
            }
        });

        set.add(new DistancePair(0,srcNode));

        while (!set.isEmpty()){
            DistancePair pair=set.pollFirst();
            int dist=pair.distance;
            int node=pair.node;
            for (DistancePair pairValue: adjList.get(node)){
                int wt=pairValue.distance;
                int adjNode=pairValue.node;
                if (wt+dist<distance[adjNode]){
                    if (distance[adjNode]!=1e9){
                        DistancePair pair1=new DistancePair(distance[adjNode],adjNode);
                        set.remove(pair1);
                    }
                    distance[adjNode]=wt+dist;
                    set.add(new DistancePair(wt+dist,adjNode));
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
        int srcNode=0;
        System.out.println(Arrays.toString(findShortestDistanceSet(nodes,edges,srcNode)));
    }
}
