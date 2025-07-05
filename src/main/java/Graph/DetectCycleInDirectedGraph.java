package Graph;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {

    private static boolean detectCycleDfs(ArrayList<ArrayList<Integer>> adjList, int nodes) {
        boolean[] vis=new boolean[nodes+1];
        int[] pathWay=new int[nodes+1];
        for (int i = 1; i <= nodes; i++) {
            if (!vis[i]){
                if (dfsCycle(adjList,nodes,i,vis,pathWay))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfsCycle(ArrayList<ArrayList<Integer>> adjList, int nodes, int node, boolean[] vis, int[] pathWay) {

        vis[node]=true;
        pathWay[node]=1;
        for (Integer it:adjList.get(node)){
            if (!vis[it]){
                if (dfsCycle(adjList, nodes, it, vis, pathWay)){
                    return true;
                }
            }else if (pathWay[it]==1){
                return true;
            }
        }
        pathWay[node]=0;
        return false;
    }

    public static void main(String[] args) {
        int nodes=10;
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for (int i = 0; i <= nodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(1).add(2);
        adjList.get(2).add(3);
        adjList.get(3).add(4);
        adjList.get(3).add(7);
        adjList.get(4).add(5);
        adjList.get(5).add(6);
        adjList.get(7).add(5);
        adjList.get(8).add(2);
        adjList.get(8).add(9);
        adjList.get(9).add(10);
        adjList.get(10).add(8);

        System.out.println(detectCycleDfs(adjList,nodes));
    }


}
