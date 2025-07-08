package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortDFS {

    public static void main(String[] args) {
        int nodes=5;
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for (int i = 0; i <= nodes; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(2).add(3);
        adjList.get(3).add(1);
        adjList.get(4).add(0);
        adjList.get(4).add(1);
        adjList.get(5).add(0);
        adjList.get(5).add(2);

        System.out.println(topoSortDFS(adjList,nodes));
    }

    private static ArrayList<Integer> topoSortDFS(ArrayList<ArrayList<Integer>> adjList, int nodes) {
        boolean[] vis=new boolean[nodes+1];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <= nodes; i++) {
            if (!vis[i]){
                dfdTopoSort(adjList,stack,vis,i);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    private static void dfdTopoSort(ArrayList<ArrayList<Integer>> adjList, Stack<Integer> stack, boolean[] vis, int node) {

        vis[node]=true;
        for (Integer it:adjList.get(node)){
            if (!vis[it]){
                dfdTopoSort(adjList,stack,vis,it);
            }
        }
        stack.push(node);
    }

}
