package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class ValuePair{
    int first;
    int second;

    public ValuePair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
public class ShortestPathTopoSort {

    private static int[] getShortestPath(int n, int m, int[][] adjMatrix) {
        ArrayList<ArrayList<ValuePair>> adjList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int x=adjMatrix[i][0];
            int y=adjMatrix[i][1];
            int z=adjMatrix[i][2];
            adjList.get(x).add(new ValuePair(y,z));
        }
        boolean[] vis=new boolean[n];
        Stack<Integer> stack =new Stack<>();

        for (int i = 0; i < n; i++) {
            if (!vis[i]){
                dfsShortest(adjList,vis,stack,i);
            }
        }
        int[] distance=new int[n];
        Arrays.fill(distance, (int) 1e9);
        distance[0]=0;
        while (!stack.isEmpty()){
            int node=stack.pop();

            for (ValuePair it:adjList.get(node)){
                int v=it.first;
                int wt=it.second;
                if (distance[node]+wt < distance[v]){
                    distance[v]=distance[node]+wt;
                }
            }
        }
        return distance;
    }

    private static void dfsShortest(ArrayList<ArrayList<ValuePair>> adjList, boolean[] vis, Stack<Integer> stack, int node) {
        vis[node]=true;
        for (ValuePair it:adjList.get(node)){
            if (!vis[it.first]){
                dfsShortest(adjList,vis,stack,it.first);
            }
        }
        stack.push(node);
    }

    public static void main(String[] args) {
        int n = 6;
        int m = 7;
        int[][] adjMatrix = {
                {0, 1, 2},
                {0, 4, 1},
                {4, 5, 4},
                {4, 2, 2},
                {1, 2, 3},
                {2, 3, 6},
                {5, 3, 1}
        };
        System.out.println(Arrays.toString(getShortestPath(n, m, adjMatrix)));
    }

}
