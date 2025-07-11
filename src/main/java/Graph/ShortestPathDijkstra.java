package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class ShortestPathDijkstra {
    private static Stack<Integer> findShortestDistanceBfs(int nodes, int[][] edges, int srcNode, int dest) {
        ArrayList<ArrayList<DistancePair>> adjList=constructAdjList(edges,nodes);
        int[] distance=new int[nodes+1];
        int[] pathway=new int[nodes+1];
        for (int i = 1; i <= nodes; i++) {
            pathway[i]=i;
        }
        Arrays.fill(distance, (int) 1e9);
        distance[srcNode]=0;

        PriorityQueue<DistancePair> queue=new PriorityQueue<>((o1, o2) -> o1.distance-o2.distance);
        queue.add(new DistancePair(0,srcNode));

        while (!queue.isEmpty()){
            DistancePair pair=queue.poll();
            int dist=pair.distance;
            int node=pair.node;
            for (DistancePair pair1: adjList.get(node)){
                int wtDist= pair1.distance;
                int adjNode= pair1.node;
                int totalDistance=wtDist+dist;
                if (totalDistance<distance[adjNode]){
                    distance[adjNode]=totalDistance;
                    pathway[adjNode]=node;
                    queue.add(new DistancePair(totalDistance,adjNode));
                }
            }
        }
        Stack<Integer> st=new Stack<>();
        if (distance[nodes]==1e9){
            st.add(-1);
            return st;
        }
        st.add(dest);
        int node=dest;
        while (pathway[node]!=srcNode){
            int previousNode=pathway[node];
            st.add(previousNode);
            node=previousNode;
        }
        st.add(srcNode);
        return st;
    }
    private static ArrayList<ArrayList<DistancePair>> constructAdjList(int[][] edges,int nodes) {
        ArrayList<ArrayList<DistancePair>> adjList=new ArrayList<>();
        for (int i = 0; i <= nodes; i++) {
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
        int nodes = 5;
        int[][] edges={
                {1,2,2},
                {2,5,5},
                {2,3,4},
                {1,4,1},
                {4,3,3},
                {3,5,1}
        };
        int srcNode=1;
        int dest=nodes;
        Stack<Integer> st =findShortestDistanceBfs(nodes,edges,srcNode,dest);
       while (!st.isEmpty()){
           int num=st.pop();
           System.out.print(num +" -> ");
       }
    }

}
