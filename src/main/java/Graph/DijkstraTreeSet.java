package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DijkstraTreeSet {

    private static int[] findShortestDistanceSet(int nodes, int[][] edges, int srcNode) {
        ArrayList<ArrayList<DistancePair>> adjList=constructAdjList(edges,nodes);

    }
    private static ArrayList<ArrayList<DistancePair>> constructAdjList(int[][] edges,int nodes) {
        ArrayList<ArrayList<DistancePair>> adjList=new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] value :edges){
            int distance=value[2];
            int node=value[1];
            int i=value[0];
            adjList.get(i).add(new DistancePair(distance,node));
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
        System.out.println(Arrays.toString(findShortestDistanceSet(nodes,edges,srcNode)));
    }
}
